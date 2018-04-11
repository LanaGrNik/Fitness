package com.example.afrodita.fitness;

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

public class InfoActivity extends AppCompatActivity {

    int positionNumber;
    final String LOG_TAG = "positionNumber";

    private static final String TITLE = "Заголовок"; // Верхний текст
    private static final String DESCRIPTION = "description"; // ниже главного
    private static final String ICON = "icon";  // будущая картинка

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ListView listInfo = findViewById(R.id.listView);


        positionNumber = getIntent().getIntExtra("position", 0);

        Log.d(LOG_TAG, "position = "
                + positionNumber);



        switch (positionNumber) {
            case 0:
                ArrayList<HashMap<String, Object>> methods1 = new ArrayList<>();
                HashMap<String, Object> hashMap;

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Приседания"); // Название
                hashMap.put(DESCRIPTION, "х30"); // Описание
                hashMap.put(ICON, R.drawable.prisad); // Картинка
                methods1.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Выпады"); // Название
                hashMap.put(DESCRIPTION, "х30"); // Описание
                hashMap.put(ICON, R.drawable.vipadi); // Картинка
                methods1.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Приседание плие");
                hashMap.put(DESCRIPTION, "х30"); // Описание
                hashMap.put(ICON, R.drawable.plie); // Картинка
                methods1.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Приседание с плечом"); // Название
                hashMap.put(DESCRIPTION, "х30"); // Описание
                hashMap.put(ICON, R.drawable.plecho); // Картинка
                methods1.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Отведение ног назад"); // Название
                hashMap.put(DESCRIPTION, "х30"); // Описание
                hashMap.put(ICON, R.drawable.nogi_nazad); // Картинка
                methods1.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Перекрестные выпады"); // Название
                hashMap.put(DESCRIPTION, "х30"); // Описание
                hashMap.put(ICON, R.drawable.perekrest); // Картинка
                methods1.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Поднятие корпуса на мяче"); // Название
                hashMap.put(DESCRIPTION, "х30"); // Описание
                hashMap.put(ICON, R.drawable.bool); // Картинка
                methods1.add(hashMap);


                SimpleAdapter adapter = new SimpleAdapter(this, methods1,
                        R.layout.list_info_item, new String[]{TITLE, DESCRIPTION, ICON},
                        new int[]{R.id.textview_title, R.id.textview_description, R.id.imageview_icon});

                // Устанавливаем адаптер для списка
                listInfo.setAdapter(adapter);


                break;
            case 1:
                ArrayList<HashMap<String, Object>> methods2 = new ArrayList<>();
                break;
            case 2:
                ArrayList<HashMap<String, Object>> methods3 = new ArrayList<>();
                break;
            case 3:
                Toast.makeText(getApplicationContext(),
                        "Вам нужно отдохнуть" , Toast.LENGTH_SHORT)
                        .show();



        }







    }


}

