package com.example.afrodita.fitness.mvp.exercise_list;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.afrodita.fitness.ExerciseAdapter;
import com.example.afrodita.fitness.mvp.excercise.ExerciseFragment;
import com.example.afrodita.fitness.FitnessApplication;
import com.example.afrodita.fitness.PhysicalExercise;
import com.example.afrodita.fitness.R;

import java.util.ArrayList;

import javax.inject.Inject;


public class ExerciseListFragment extends Fragment implements ExerciseListContract.View {


    @Inject
    ExerciseListPresenter presenter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.exercise_list_fragment, null);

        ((FitnessApplication) getActivity().getApplication()).getComponent().inject(this);
        presenter.onAttach(this);
        ListView listInfo = v.findViewById(R.id.listView);
        ArrayList<PhysicalExercise> methods = presenter.loadExerciseList();


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

                                                Fragment fragment = new ExerciseFragment();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("position", position);
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
