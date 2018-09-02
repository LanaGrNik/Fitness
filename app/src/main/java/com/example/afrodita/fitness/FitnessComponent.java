package com.example.afrodita.fitness;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = FitnessModule.class)
public interface FitnessComponent {

    void inject(FragmentEx1 fragmentEx1);
    void inject(Fragment1 fragment1);
    void inject(InfoActivity infoActivity);

}
