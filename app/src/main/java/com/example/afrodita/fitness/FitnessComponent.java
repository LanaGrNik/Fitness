package com.example.afrodita.fitness;

import dagger.Component;

@Component(modules = FitnessModule.class)
public interface FitnessComponent {

    void inject(FragmentEx1 fragmentEx1);
}
