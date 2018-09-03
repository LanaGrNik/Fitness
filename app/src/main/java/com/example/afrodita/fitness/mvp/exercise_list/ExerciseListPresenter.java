package com.example.afrodita.fitness.mvp.exercise_list;

import com.example.afrodita.fitness.ExerciseRepository;
import com.example.afrodita.fitness.PhysicalExercise;

import java.util.ArrayList;

import javax.inject.Inject;

public class ExerciseListPresenter implements ExerciseListContract.Presenter {

    ExerciseListContract.View view;
    ExerciseRepository exerciseRepository;

    @Inject
    public ExerciseListPresenter(ExerciseRepository exerciseRepository){
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public void onAttach(ExerciseListContract.View view) {
        this.view = view;
        }

    @Override
    public ArrayList<PhysicalExercise> loadExerciseList() {
        return exerciseRepository.getExercisesList();
    }
}
