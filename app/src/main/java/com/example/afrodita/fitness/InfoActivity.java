package com.example.afrodita.fitness;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import javax.inject.Inject;

public class InfoActivity extends AppCompatActivity {
    @Inject
    ExerciseRepository exerciseRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ((FitnessApplication)getApplication()).getComponent().inject(this);

       int day = getIntent().getIntExtra("day",1);
       exerciseRepository.replaceList(day);


        Fragment fragment = new Fragment1();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_layout, fragment)
                .commit();




    }


}

