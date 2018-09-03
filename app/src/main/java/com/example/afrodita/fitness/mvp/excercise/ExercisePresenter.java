package com.example.afrodita.fitness.mvp.excercise;

import com.example.afrodita.fitness.ExerciseRepository;
import com.example.afrodita.fitness.PhysicalExercise;
import com.example.afrodita.fitness.mvp.exercise_list.ExerciseListContract;

import javax.inject.Inject;

public class ExercisePresenter implements ExerciseContract.Presenter {

    ExerciseContract.View view;
    ExerciseRepository exerciseRepository;

    @Inject
    public ExercisePresenter( ExerciseRepository exerciseRepository){
        this.exerciseRepository = exerciseRepository;
    }


    @Override
    public void onAttach(ExerciseContract.View view) {
        this.view = view;
    }

    @Override
    public PhysicalExercise findByPosition(int position) {

        return exerciseRepository.getExercisesList().get(position);

    }
}
