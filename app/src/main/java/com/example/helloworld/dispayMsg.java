package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.TextView;


public class dispayMsg extends AppCompatActivity {
    private final String EXTRA_MESSAGE = "com.example.helloworld.MESSAGE";
    private final WebView myWebView = (WebView) findViewById(R.id.webview);
    private final TextView textView = findViewById(R.id.textView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispay_msg);

        Intent intent = getIntent();
        String message = intent.getStringExtra(this.EXTRA_MESSAGE);

        textView.setText(message);

        switch(message.toLowerCase()) {
            case "chanakan": {
                textView.setText("ello chanakan, this is an if statement");
                WebViewChanakan();
            } break;
            case "joel": {
                textView.setText("Hai joel, ini lagu favoritmu.");
                WebViewJoel();
            } break;
            case "sudo test": {
                test();
            } break;
            default: {
                textView.setText("ERROR, You haven't entered anything yet");
            } break;
        }

    }
    private void WebViewChanakan(){
        myWebView.loadUrl("https://chanakancloud.net");
    }

    private void WebViewJoel(){
        myWebView.loadUrl("https://youtu.be/eU2cTay_0Co");
    }

    private void test(){
        myWebView.loadUrl("https://google.com");
    }
}