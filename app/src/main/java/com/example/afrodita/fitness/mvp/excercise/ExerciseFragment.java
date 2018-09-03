package com.example.afrodita.fitness.mvp.excercise;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.afrodita.fitness.FitnessApplication;
import com.example.afrodita.fitness.GifSwitcher;
import com.example.afrodita.fitness.PhysicalExercise;
import com.example.afrodita.fitness.R;


import javax.inject.Inject;


public class ExerciseFragment extends Fragment implements ExerciseContract.View {

    @Inject
    ExercisePresenter presenter;

    PhysicalExercise element;
    TextView mTimer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.exercise_fragment, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((FitnessApplication) getActivity().getApplication()).getComponent().inject(this);

        presenter.onAttach(this);

        Bundle bundle = getArguments();

        if (bundle != null) {
            Integer position = bundle.getInt("position");
            element = presenter.findByPosition(position);
        }

        TextView tVT = view.findViewById(R.id.tVExTitle);
        tVT.setText(element.titleId);

        TextView tVDesc = view.findViewById(R.id.tVExDescription);
        tVDesc.setText(element.descriptionId);

        final GifSwitcher gifSwitcher = view.findViewById(R.id.iVExGif);
        gifSwitcher.setGifResourse(element.icon);

        mTimer = view.findViewById(R.id.countDownTimer);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTimer.setText("Приготовтесь: "
                        + millisUntilFinished / 1000);
            }

            public void onFinish() {
                gifSwitcher.toggleAnimate(true);
                mTimer.setText(null);

            }
        }
                .start();

    }
}
