package com.example.kidsmathlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imgLogo, imgNhacNen;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        imgNhacNen = findViewById(R.id.imageView2);
        mediaPlayer = MediaPlayer.create(this, R.raw.nhacnen);
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.start();

        imgNhacNen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pauseAction();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Home.class);
                startActivity(intent);
            }
        });
    }


    public int PlayAction() {
        mediaPlayer.start();
        return 1;
    }

    public int pauseAction() {
        mediaPlayer.pause();
        imgNhacNen.setImageResource(R.drawable.unloa);
        return -1;
    }


    private class MyRunnable extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                imgLogo = findViewById(R.id.imageViewlogo);
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.demo);
                imgLogo.startAnimation(animation);
                PlayAction();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}