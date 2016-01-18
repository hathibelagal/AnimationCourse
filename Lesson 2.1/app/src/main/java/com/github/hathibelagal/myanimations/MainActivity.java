package com.github.hathibelagal.myanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View container;
    private boolean playAnimations = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus && playAnimations) {
            showContainer();
            playAnimations = false;
        }
    }

    private void showContainer() {
        container.animate().alpha(1f).setDuration(1000);
    }
}
