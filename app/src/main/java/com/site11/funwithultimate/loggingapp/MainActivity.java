package com.site11.funwithultimate.loggingapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rel1, rel2;

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                rel1.setVisibility(View.VISIBLE);
                rel2.setVisibility(View.VISIBLE);
            }
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            rel1 = (RelativeLayout) findViewById(R.id.rel1);
            rel2 = (RelativeLayout) findViewById(R.id.rel2);

            handler.postDelayed(runnable, 2000);
        }



}
