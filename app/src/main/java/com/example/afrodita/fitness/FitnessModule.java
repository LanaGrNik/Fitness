package com.example.afrodita.fitness;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class FitnessModule {

    Context context;

    public FitnessModule(Context context){
        this.context = context;
    }


    @Provides
    public Context provideContext(){
        return context;
    }

}
