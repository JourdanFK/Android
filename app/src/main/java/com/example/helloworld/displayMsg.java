package com.example.helloworld;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;


public class displayMsg extends AppCompatActivity {

    private final WebView myWebView = findViewById(R.id.webview);
    private final TextView textView = findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);

        String EXTRA_MESSAGE = "com.example.helloworld.MESSAGE";
        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        System.out.println(message);
        textView.setText(message);

        switch(message.toLowerCase()) {
            case "chanakan": {
                textView.setText("Get redirected to your own website");
                WebViewChanakan();
            } break;
            case "sudo test": {
                test();
            } break;
            default: {
                textView.setText("Enter something and try again");
            } break;
        }

    }
    private void WebViewChanakan(){
        myWebView.loadUrl("https://chanakancloud.net");
    }

    private void test(){
        myWebView.loadUrl("https://google.com");
    }
}