package com.example.afrodita.fitness;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;

import pl.droidsonroids.gif.GifImageView;

public class FragmentEx1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ex_1, null);


        TextView tVT = v.findViewById(R.id.tVEx1Title);
        tVT.setText(R.string.sit_ups);


        GifImageView gImageView = v.findViewById(R.id.iVEx1);
        gImageView.setImageResource(R.drawable.prisad);

        TextView tVDesc = v.findViewById(R.id.tVEx1Description);
        tVDesc.setText(R.string.sit_ups_description);


       /*  TextView mTimer = (TextView)v.findViewById(R.id.countDownTimer);

        //Создаем таймер обратного отсчета на 20 секунд с шагом отсчета
        //в 1 секунду (задаем значения в миллисекундах):
        new CountDownTimer(30000, 1000) {

            //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
            public void onTick(long millisUntilFinished) {
                mTimer.setText("Осталось: "
                        + millisUntilFinished / 1000);
            }
            //Задаем действия после завершения отсчета (высвечиваем надпись "Бабах!"):
            public void onFinish() {
                mTimer.setText("Бабах!");
            }
        }
                .start();
    }*/

        return v;
    }
}
