package com.example.afrodita.fitness;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import javax.inject.Inject;


public class Fragment1 extends Fragment {

    @Inject
    ArrayList<PhysicalExercise> methods;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment1, null);

        ((FitnessApplication) getActivity().getApplication()).getComponent().inject(this);
        ListView listInfo = v.findViewById(R.id.listView);

        if (methods.isEmpty()){
            new AlertDialog.Builder(getContext())
                    .setMessage("Отдохните!")
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            getActivity().finish();
                        }
                    })
                    .create()
                    .show();
        }
        ExerciseAdapter adapter = new ExerciseAdapter(getContext(), methods);
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
