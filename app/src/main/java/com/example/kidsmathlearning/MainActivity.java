package com.example.kidsmathlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Huy NGU VCC", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Huy NGU VCC", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Huy NGU VCC", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Huy NGU VCC", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private class MyRunnable extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                imgLogo = findViewById(R.id.imageViewlogo);
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.demo);
                imgLogo.startAnimation(animation);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}