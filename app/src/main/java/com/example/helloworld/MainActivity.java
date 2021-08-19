package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.helloworld.MESSAGE";
    private final TextView textView = findViewById(R.id.textView3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //UpdateTime thread = new UpdateTime();
        //thread.start();

    }

    public void sendMsg(View view){
    Intent intent = new Intent(this, dispayMsg.class);
    EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);

    }

    public void test(View view){
        Intent intent = new Intent(this, test.class);
        startActivity(intent);
    }

    public void date(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
        String strDate = dateFormat.format(date);
        textView.setText(strDate);
    }
}