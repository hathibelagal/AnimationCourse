package com.github.hathibelagal.myanimations;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View container;
    private View welcome;

    private boolean playAnimations = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);
        welcome = findViewById(R.id.welcome);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus && playAnimations) {
            showContainer();
            showOtherItems();
            playAnimations = false;
        }
    }

    private void showContainer() {
        container.animate().alpha(1f).setDuration(1000);
    }

    private void showOtherItems() {
        float startXWelcome = 0 - welcome.getWidth();
        float endXWelcome = welcome.getX();
        ObjectAnimator animWelcome
                = ObjectAnimator.ofFloat(welcome, View.X, startXWelcome, endXWelcome);
        welcome.setVisibility(View.VISIBLE);
        animWelcome.setDuration(1500);
        animWelcome.start();
    }
}
