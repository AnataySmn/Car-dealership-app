package com.example.comp1011android;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SplashActivity extends AppCompatActivity
{

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_splash);

    Runnable Task = () -> {
    startActivity(new Intent(getApplicationContext(), MainActivity.class));
    };

    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
   // scheduledExecutorService.schedule(task,3, TimeUnit.SECONDS);
}

}
