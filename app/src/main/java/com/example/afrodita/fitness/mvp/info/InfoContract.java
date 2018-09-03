package com.example.afrodita.fitness.mvp.info;

public interface InfoContract {

    interface View{

        void openExerciseList();

    }

    interface Presenter{

        void onAttach(View view);

        void replaceList(int day);

        void onDetach();
    }
}
