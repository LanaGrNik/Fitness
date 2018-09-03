package com.example.afrodita.fitness.mvp.exercise_list;

import com.example.afrodita.fitness.PhysicalExercise;

import java.util.ArrayList;

public interface ExerciseListContract {

    interface View{

    }

    interface Presenter{

      void  onAttach(View view);

        ArrayList<PhysicalExercise> loadExerciseList();
    }


}
