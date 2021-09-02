package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("onCreate");
        super.onCreate(savedInstanceState);
        System.out.println("Super");
        setContentView(R.layout.activity_main);
        System.out.println("setContentView");
    }
    public void sendMsg(View view){
        System.out.println("void sendMsg");
        Intent intent = new Intent(this, displayMsg.class);
        System.out.println("new Intent()");
        EditText editText = findViewById(R.id.editTextTextPersonName);
        System.out.println("findViewByID editText");
        String message = editText.getText().toString();
        System.out.println("String Message");
        String EXTRA_MESSAGE = "com.example.helloworld.MESSAGE";
        System.out.println("String EXTRA_MESSAGE");
        intent.putExtra(EXTRA_MESSAGE, message);
        System.out.println("Intent putExtra");
        startActivity(intent);
        System.out.println(intent);
        System.out.println("startActivity");

    }
}