package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText time_up = (EditText)findViewById(R.id.time_up);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View view) {
        int time_save_int=time_save;
        int time_int=time;
        String time_save = time_up.getText().toString();

        Calendar c = Calendar.getInstance();

        int minutes = c.get(Calendar.MINUTE);
        int hour = c.get(Calendar.HOUR);
        String time = hour + ":" + minutes;

        if (time_save_int == time_int) {
    Toast toast = Toast.makeText(MainActivity.this, "Примите лекарство" , Toast.LENGTH_LONG);
        toast.show(); }
else if (time_save_int>=time_int){Toast toast = Toast.makeText(MainActivity.this, "Вы забыли принять лекарство", Toast.LENGTH_LONG);
    toast.show();}
else if (time_save_int<=time_int){Toast toast = Toast.makeText(MainActivity.this, "Примите лекарство позже", Toast.LENGTH_LONG);
    toast.show();}


    }}