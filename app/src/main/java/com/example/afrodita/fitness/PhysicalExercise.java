package com.example.afrodita.fitness;

import android.support.annotation.DrawableRes;

import java.util.Objects;

public class PhysicalExercise {

    public int titleId;
    public int countId;
    public @DrawableRes int icon;
    public int descriptionId;


    public PhysicalExercise(int titleId, int countId, int icon, int descriptionId) {
        this.titleId = titleId;
        this.countId = countId;
        this.icon = icon;
        this.descriptionId = descriptionId;
    }


}
