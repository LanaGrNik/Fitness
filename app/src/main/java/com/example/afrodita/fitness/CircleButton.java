package com.example.afrodita.fitness;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import pl.droidsonroids.gif.GifImageView;

public class CircleButton extends LinearLayout {

    TextView tvCircleBtn;

    public CircleButton(Context context) {
        super(context);
        initComponent();

    }

    public CircleButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initComponent();
    }

    public CircleButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initComponent();
    }

    private void initComponent() {
    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.circle_button, this);

        tvCircleBtn = findViewById(R.id.tvCircleBtn);
    }

    public void setText(String text){

        tvCircleBtn.setText(text);

    }
}
