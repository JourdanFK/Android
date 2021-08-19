package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }



    public void nameTest(View view){
        Intent intent = new Intent(this, dispayMsg.class);
        startActivity(intent);
    }

    public void WebViewTest(View view) {
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://google.com");
    }
}