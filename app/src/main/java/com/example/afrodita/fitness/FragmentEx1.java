package com.example.afrodita.fitness;


import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.Timer;


import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;


public class
FragmentEx1 extends Fragment {

    Integer recieveInfo;

    ArrayList<PhysicalExercise> methods1 = new ArrayList<>();
    PhysicalExercise element;
    TextView mTimer;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ex_1, null);

        methods1.addAll(ExerciseRepository.getExercise());


        Bundle bundle = getArguments();


        if (bundle != null) {
             recieveInfo = bundle.getInt("tag");

             for (int i = 0; i<=methods1.size(); i++){
                 if (recieveInfo == i){
                    element = methods1.get(i);




                 }
             }
        }


        TextView tVT = v.findViewById(R.id.tVEx1Title);
        tVT.setText(element.titleId);


   // final GifImageView gImageView = v.findViewById(R.id.iVEx1);
  //  gImageView.setImageResource(element.icon);


         TextView tVDesc = v.findViewById(R.id.tVEx1Description);
        tVDesc.setText(element.descriptionId);

       final GifSwitcher gifSwitcher = v.findViewById(R.id.iVExGif);
       gifSwitcher.setGifResourse(element.icon);


        mTimer = v.findViewById(R.id.countDownTimer);

        //Создаем таймер обратного отсчета на 20 секунд с шагом отсчета
        //в 1 секунду (задаем значения в миллисекундах):
        new CountDownTimer(10000, 1000) {

            //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
            public void onTick(long millisUntilFinished) {
                mTimer.setText("Приготовтесь: "
                        + millisUntilFinished / 1000);




            }
            //Задаем действия после завершения отсчета
            public void onFinish() {

               gifSwitcher.toggleAnimate(true);
               mTimer.setText(null);




            }
        }
                .start();


        return v;
    }
}
