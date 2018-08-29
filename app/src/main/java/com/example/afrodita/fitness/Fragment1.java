package com.example.afrodita.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


public class Fragment1 extends Fragment {


    ArrayList<PhysicalExercise> methods1 = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment1, null);


        ListView listInfo = v.findViewById(R.id.listView);
        Button btnStart = v.findViewById(R.id.buttonStart);

        methods1.addAll(ExerciseRepository.getExercise());
        ExerciseAdapter adapter = new ExerciseAdapter(getContext(), methods1);
        listInfo.setAdapter(adapter);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new FragmentEx1();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_layout, fragment)
                        .commit();

            }
        });


        return v;


    }

}
