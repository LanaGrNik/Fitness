package com.example.afrodita.fitness;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {


    Button btn1;
   /* Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int a;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout = findViewById(R.id.grid_layout_days);




        for (int i = 1; i <= 30; i++) {

            final int day = i;
            Button bDay = new Button(this);
            bDay.setText(String.valueOf(i));

           bDay.setWidth(70);
           bDay.setHeight(70);



            bDay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                    intent.putExtra("day", day);
                    startActivity(intent);

                }
            });
         gridLayout.addView(bDay);


        }



    }


}