package com.example.afrodita.fitness;

import android.app.Application;

import com.example.afrodita.fitness.dagger.DaggerFitnessComponent;
import com.example.afrodita.fitness.dagger.FitnessComponent;
import com.example.afrodita.fitness.dagger.FitnessModule;

public class FitnessApplication extends Application {

    FitnessComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerFitnessComponent.builder()
                .fitnessModule(new FitnessModule(this))
                .build();
    }

    public FitnessComponent getComponent() {
        return component;
    }
}
