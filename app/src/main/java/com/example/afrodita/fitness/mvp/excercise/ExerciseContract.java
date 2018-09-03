package com.example.afrodita.fitness.mvp.excercise;

import com.example.afrodita.fitness.PhysicalExercise;

public interface ExerciseContract {

    interface View{

    }

    interface Presenter{

        void onAttach(View view);

        PhysicalExercise findByPosition(int position);
    }
}
