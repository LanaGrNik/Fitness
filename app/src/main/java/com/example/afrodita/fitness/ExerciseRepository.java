package com.example.afrodita.fitness;

import java.util.ArrayList;

public class ExerciseRepository {


    public static ArrayList<PhysicalExercise> getExercise() {

        PhysicalExercise phEx1 = new PhysicalExercise(R.string.sit_ups, R.string.count3, R.drawable.prisad, R.string.sit_ups_description);
        PhysicalExercise phEx2 = new PhysicalExercise(R.string.lunge, R.string.count1, R.drawable.vipadi,R.string.lunge_description);
        PhysicalExercise phEx3 = new PhysicalExercise(R.string.sit_up_plie,R.string.count2, R.drawable.plie, R.string.sit_up_plie_description);
        PhysicalExercise phEx4 = new PhysicalExercise(R.string.sit_up_with_the_shoulder, R.string.count2, R.drawable.plecho, R.string.sit_up_with_the_shoulder_description);
        PhysicalExercise phEx5 = new PhysicalExercise(R.string.backing, R.string.count3, R.drawable.nogi_nazad, R.string.backing_description);
        PhysicalExercise phEx6 = new PhysicalExercise(R.string.cross_lunges, R.string.count2, R.drawable.perekrest, R.string.cross_lunges_description);
        PhysicalExercise phEx7 = new PhysicalExercise(R.string.hull_lifting, R.string.count3, R.drawable.bool, R.string.hull_lifting_description);


        ArrayList<PhysicalExercise> methods1 = new ArrayList<>();


        methods1.add(phEx1);
        methods1.add(phEx2);
        methods1.add(phEx3);
        methods1.add(phEx4);
        methods1.add(phEx5);
        methods1.add(phEx6);

        return methods1;
    }
}
