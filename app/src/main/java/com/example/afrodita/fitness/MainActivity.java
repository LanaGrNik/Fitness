package com.example.afrodita.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogsId";
    int position;


    String  days[] = {"1 день","2 день","3 день","4 день","5 день","6 день","7 день","8 день","9 день","10 день",
            "11 день","12 день","13 день","14 день","15 день","16 день","17 день","18 день","19 день","20 день",
            "21 день","22 день","23 день","24 день","25 день","26 день","27 день","28 день","29 день","30 день"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ListView listView = findViewById(R.id.listView);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item, days);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               long position = l ;

                 Log.d(LOG_TAG, "position = "
                        + position);

                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("position" , (int)position);
                startActivity(intent);



            }
        });

    }
}
