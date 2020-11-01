package com.example.progress;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.view.MotionEvent;

public class MainActivity extends Activity {

    private ProgressBar progressBar;
    private int val = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);

        progressBar.setMax(1000);


        Button button = (Button) findViewById(R.id.button);
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public void onTouch(View v, MotionEvent event) {
                //val += 1;
                //progressBar.setProgress(val);
                //progressBar.setSecondaryProgress(700);
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.v("OnTouch", "Touch Down");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.v("OnTouch", "Touch Up");
                }
                return false;
            }
        });
    }
}





