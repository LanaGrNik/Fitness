package com.example.afrodita.fitness.mvp.info;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.afrodita.fitness.FitnessApplication;
import com.example.afrodita.fitness.mvp.exercise_list.ExerciseListFragment;
import com.example.afrodita.fitness.R;

import javax.inject.Inject;

public class InfoActivity extends AppCompatActivity implements InfoContract.View {

    @Inject
    InfoPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ((FitnessApplication) getApplication()).getComponent().inject(this);

        presenter.onAttach(this);
        int day = getIntent().getIntExtra("day", 1);
        presenter.replaceList(day);
    }


    @Override
    public void openExerciseList() {

        Fragment fragment = new ExerciseListFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_layout, fragment)
                .commit();
    }
}

