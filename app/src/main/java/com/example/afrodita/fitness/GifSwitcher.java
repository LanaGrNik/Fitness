package com.example.afrodita.fitness;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import pl.droidsonroids.gif.GifImageView;

public class GifSwitcher extends LinearLayout {

    ImageView imageView;
    GifImageView gifImageView;

    public GifSwitcher(Context context) {
        super(context);
        initComponent();

    }

    public GifSwitcher(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initComponent();
    }

    public GifSwitcher(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initComponent();
    }

    private void initComponent() {
    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.gif_switcher, this);

        imageView = findViewById(R.id.ivStatic);

        gifImageView = findViewById(R.id.ivGif);
    }

    public void setGifResourse(@DrawableRes int resId) {
        imageView.setImageResource(resId);
        gifImageView.setImageResource(resId);
    }

    public void toggleAnimate(boolean isAnimate){
        imageView.setVisibility(isAnimate ? GONE : VISIBLE);
        gifImageView.setVisibility(isAnimate ? VISIBLE : GONE);
    }
}
