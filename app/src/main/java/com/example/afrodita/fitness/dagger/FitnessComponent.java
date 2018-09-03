package com.example.afrodita.fitness.dagger;

import com.example.afrodita.fitness.Fragment1;
import com.example.afrodita.fitness.FragmentEx1;
import com.example.afrodita.fitness.mvp.info.InfoActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = FitnessModule.class)
public interface FitnessComponent {

    void inject(FragmentEx1 fragmentEx1);
    void inject(Fragment1 fragment1);
    void inject(InfoActivity infoActivity);

}
