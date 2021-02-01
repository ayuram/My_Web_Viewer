package com.example.mywebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewer extends AppCompatActivity {
    private String url = "https://www.yahoo.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView webView = findViewById(R.id.web);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        webView.loadUrl(url);
    }
}