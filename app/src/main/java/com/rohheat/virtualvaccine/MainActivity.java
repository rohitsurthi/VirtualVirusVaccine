package com.rohheat.virtualvaccine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button startBtn;
    private ImageView head,body;
    private Animation injectAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        head = findViewById(R.id.head);
        body = findViewById(R.id.body);
        startBtn = findViewById(R.id.start);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inject();
            }
        });

    }
    public void inject(){
        injectAnim = AnimationUtils.loadAnimation(this,R.anim.inject_animation);
        head.startAnimation(injectAnim);
    }
}