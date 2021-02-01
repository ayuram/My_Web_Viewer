package com.example.mywebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String URL = "https://extension.ucsd.edu/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button yahoo = findViewById(R.id.yahoo);
        Button ucsd = findViewById(R.id.UCSD);
        yahoo.setOnClickListener(view -> {
            URL = "https://www.yahoo.com";
            openWeb();
        });
        ucsd.setOnClickListener(view -> {
            URL = "https://extension.ucsd.edu/";
            openWeb();
        });
    }
    private void openWeb(){
        Intent intent = new Intent(this, WebViewer.class);
        intent.putExtra("url", URL);
        startActivity(intent);
    }
}