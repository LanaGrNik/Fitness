package com.example.afrodita.fitness.dagger;

import android.content.Context;

import com.example.afrodita.fitness.PhysicalExercise;

import java.util.ArrayList;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FitnessModule {

    Context context;
  //  ArrayList<PhysicalExercise> ph = new ArrayList<PhysicalExercise>();

    public FitnessModule(Context context){
        this.context = context;
    }


    @Provides
    public Context provideContext(){
        return context;
    }

 /*   @Singleton
    @Provides
    public ArrayList<PhysicalExercise> providePh() {
     //   ph.addAll(ExerciseRepository.getExercise());
        return ph;
    }*/
}
