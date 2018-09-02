package com.example.afrodita.fitness;

import java.util.ArrayList;

import javax.inject.Inject;

public class ExerciseRepository {

    PhysicalExercise phEx1 = new PhysicalExercise(R.string.sit_ups, R.string.count3, R.drawable.prisad, R.string.sit_ups_description);
    PhysicalExercise phEx2 = new PhysicalExercise(R.string.lunge, R.string.count1, R.drawable.vipadi, R.string.lunge_description);
    PhysicalExercise phEx3 = new PhysicalExercise(R.string.sit_up_plie, R.string.count2, R.drawable.plie, R.string.sit_up_plie_description);
    PhysicalExercise phEx4 = new PhysicalExercise(R.string.sit_up_with_the_shoulder, R.string.count2, R.drawable.plecho, R.string.sit_up_with_the_shoulder_description);
    PhysicalExercise phEx5 = new PhysicalExercise(R.string.backing, R.string.count3, R.drawable.nogi_nazad, R.string.backing_description);
    PhysicalExercise phEx6 = new PhysicalExercise(R.string.cross_lunges, R.string.count2, R.drawable.perekrest, R.string.cross_lunges_description);
    PhysicalExercise phEx7 = new PhysicalExercise(R.string.hull_lifting, R.string.count3, R.drawable.bool, R.string.hull_lifting_description);
    PhysicalExercise phEx8 = new PhysicalExercise(R.string.rainbow_exercise, R.string.count2, R.drawable.radyga, R.string.rainbow_exercise_description);

    ArrayList<PhysicalExercise> exercisesList;

    @Inject
    public ExerciseRepository(ArrayList<PhysicalExercise> exercisesList) {
        this.exercisesList = exercisesList;
    }

    public void replaceList(int day) {

        ArrayList<PhysicalExercise> tempExerciseList;

        exercisesList.clear();


        switch (day) {
            case 1:
                tempExerciseList = getExerciseDay1();
                break;
            case 2:
                tempExerciseList = getExerciseDay2();
                break;
            case 3:
                tempExerciseList = getExerciseDay3();
                break;
            case 4:
                tempExerciseList = getExerciseDay4();
                break;
            case 5:
                tempExerciseList = getExerciseDay5();
                break;
            case 6:
                tempExerciseList = getExerciseDay6();
                break;
            case 7:
                tempExerciseList = getExerciseDay7();
                break;
            case 8:
                tempExerciseList = getExerciseDay8();
                break;
            case 9:
                tempExerciseList = getExerciseDay9();
                break;
            case 10:
                tempExerciseList = getExerciseDay10();
                break;
            case 11:
                tempExerciseList = getExerciseDay11();
                break;
            case 12:
                tempExerciseList = getExerciseDay12();
                break;
            case 13:
                tempExerciseList = getExerciseDay13();
                break;
            case 14:
                tempExerciseList = getExerciseDay14();
                break;
            case 15:
                tempExerciseList = getExerciseDay15();
                break;
            case 16:
                tempExerciseList = getExerciseDay16();
                break;
            case 17:
                tempExerciseList = getExerciseDay17();
                break;
            case 18:
                tempExerciseList = getExerciseDay18();
                break;
            case 19:
                tempExerciseList = getExerciseDay19();
                break;
            case 20:
                tempExerciseList = getExerciseDay20();
                break;
            case 21:
                tempExerciseList = getExerciseDay21();
                break;
            case 22:
                tempExerciseList = getExerciseDay22();
                break;
            case 23:
                tempExerciseList = getExerciseDay23();
                break;
            case 24:
                tempExerciseList = getExerciseDay24();
                break;
            case 25:
                tempExerciseList = getExerciseDay25();
                break;
            case 26:
                tempExerciseList = getExerciseDay26();
                break;
            case 27:
                tempExerciseList = getExerciseDay27();
                break;
            case 28:
                tempExerciseList = getExerciseDay28();
                break;
            case 29:
                tempExerciseList = getExerciseDay29();
                break;
            case 30:
                tempExerciseList = getExerciseDay30();
                break;
            default: tempExerciseList = getExerciseDay1();


        }
         exercisesList.addAll(tempExerciseList);

    }

    public ArrayList<PhysicalExercise> getExerciseDay1() {


        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay2() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx2);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);
        methods.add(phEx7);
        methods.add(phEx8);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay3() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx5);
        methods.add(phEx6);
        methods.add(phEx3);
        methods.add(phEx4);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay4() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx3);
        methods.add(phEx2);
        methods.add(phEx5);
        methods.add(phEx8);
        methods.add(phEx7);
        methods.add(phEx1);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay5() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay6() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx5);
        methods.add(phEx3);
        methods.add(phEx7);
        methods.add(phEx8);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay7() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx3);
        methods.add(phEx2);
        methods.add(phEx6);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx8);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay8() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx7);
        methods.add(phEx8);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay9() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay10() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();

        return methods;
    }


    public ArrayList<PhysicalExercise> getExerciseDay11() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx8);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx7);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay12() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx8);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay13() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx8);


        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay14() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx7);
        methods.add(phEx8);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay15() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();

        return methods;
    }


    public ArrayList<PhysicalExercise> getExerciseDay16() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx5);
        methods.add(phEx4);
        methods.add(phEx7);
        methods.add(phEx8);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay17() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx7);
        methods.add(phEx2);
        methods.add(phEx6);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx8);


        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay18() {


        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx7);
        methods.add(phEx8);
        methods.add(phEx3);
        methods.add(phEx5);
        methods.add(phEx6);


        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay19() {


        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx8);


        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay20() {


        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay21() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx2);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);
        methods.add(phEx7);
        methods.add(phEx8);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay22() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx5);
        methods.add(phEx6);
        methods.add(phEx3);
        methods.add(phEx4);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay23() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx3);
        methods.add(phEx2);
        methods.add(phEx5);
        methods.add(phEx8);
        methods.add(phEx7);
        methods.add(phEx1);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay24() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay25() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx5);
        methods.add(phEx3);
        methods.add(phEx7);
        methods.add(phEx8);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay26() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx3);
        methods.add(phEx2);
        methods.add(phEx6);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx8);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay27() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx7);
        methods.add(phEx8);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay28() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay29() {

        ArrayList<PhysicalExercise> methods = new ArrayList<>();
        methods.add(phEx1);
        methods.add(phEx2);
        methods.add(phEx3);
        methods.add(phEx4);
        methods.add(phEx5);
        methods.add(phEx6);

        return methods;
    }

    public ArrayList<PhysicalExercise> getExerciseDay30() {
        ArrayList<PhysicalExercise> methods = new ArrayList<>();

        return methods;
    }


}
