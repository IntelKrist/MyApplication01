package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    makeFullScreen();
    
setContentView(R.layout.splesh);

        Handler().postDelayed({
                startActivity(Intent(MainActivity.this, MainActivity::class.java))
        }




    }

    private fun makeFullScreen() {



    }
}