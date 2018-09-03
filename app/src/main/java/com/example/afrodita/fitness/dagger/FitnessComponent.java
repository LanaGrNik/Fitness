package com.example.afrodita.fitness.dagger;

import com.example.afrodita.fitness.mvp.excercise.ExerciseFragment;
import com.example.afrodita.fitness.mvp.exercise_list.ExerciseListFragment;
import com.example.afrodita.fitness.mvp.info.InfoActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = FitnessModule.class)
public interface FitnessComponent {

    void inject(ExerciseFragment exerciseFragment);
    void inject(ExerciseListFragment exerciseListFragment);
    void inject(InfoActivity infoActivity);

}
