package com.example.afrodita.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


public class Fragment1 extends Fragment {


    ArrayList<PhysicalExercise> methods1 = ExerciseRepository.getExercise();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment1, null);


        ListView listInfo = v.findViewById(R.id.listView);

        ExerciseAdapter adapter = new ExerciseAdapter(getContext(), methods1);
        listInfo.setAdapter(adapter);

        listInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                                                Fragment fragment = new FragmentEx1();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("tag", position);
                                                fragment.setArguments(bundle);


                                                getActivity().getSupportFragmentManager()
                                                        .beginTransaction()
                                                        .replace(R.id.frame_layout, fragment)
                                                        .addToBackStack(null)
                                                        .commit();

                                            }
                                        }

        );


        return v;


    }

}
