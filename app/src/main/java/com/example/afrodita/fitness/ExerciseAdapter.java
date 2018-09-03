package com.example.afrodita.fitness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExerciseAdapter extends BaseAdapter {
    Context context;
    LayoutInflater lInflater;
    ArrayList<PhysicalExercise> methods = new ArrayList<>();

    public ExerciseAdapter(Context context, ArrayList<PhysicalExercise> methods) {
        this.context = context;
        this.methods.addAll(methods);
        lInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return methods.size();
    }

    @Override
    public PhysicalExercise getItem(int position) {
        return methods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        PhysicalExercise physicalExercise = getItem(i);
        view = lInflater.inflate(R.layout.list_info_item, parent, false);
        TextView titleText = view.findViewById(R.id.tvTitle);
        titleText.setText(physicalExercise.titleId);

        TextView countText = view.findViewById(R.id.tvCount);
        countText.setText(physicalExercise.countId);

        ImageView imageView = view.findViewById(R.id.ivIcon);
        imageView.setImageResource(physicalExercise.icon);





        return view;
    }
}
