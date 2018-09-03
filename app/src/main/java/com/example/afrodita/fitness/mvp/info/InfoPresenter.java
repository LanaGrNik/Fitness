package com.example.afrodita.fitness.mvp.info;

import com.example.afrodita.fitness.ExerciseRepository;

import javax.inject.Inject;

public class InfoPresenter implements InfoContract.Presenter{

    ExerciseRepository exerciseRepository;
    InfoContract.View view;

    @Inject
     public InfoPresenter( ExerciseRepository exerciseRepository){
        this.exerciseRepository = exerciseRepository;

    }


    @Override
    public void onAttach(InfoContract.View view) {
        this.view = view;

    }

    @Override
    public void replaceList(int day) {
        exerciseRepository.replaceList(day);
        view.openExerciseList();

    }

    @Override
    public void onDetach() {

    }


}
