package com.example.afrodita.fitness.mvp.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;

import com.example.afrodita.fitness.CircleButton;
import com.example.afrodita.fitness.mvp.info.InfoActivity;
import com.example.afrodita.fitness.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout = findViewById(R.id.grid_layout_days);




        for (int i = 1; i <= 30; i++) {

            final int day = i;
            CircleButton bDay = new CircleButton(this);

            bDay.setText(String.valueOf(i));

            bDay.setOnClickListener(new android.view.View.OnClickListener() {
                @Override
                public void onClick(android.view.View view) {
                    Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                    intent.putExtra("day", day);
                    startActivity(intent);

                }
            });
         gridLayout.addView(bDay);


        }



    }


}