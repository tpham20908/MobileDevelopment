package com.example.a1796137.relativelayoutex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ListView;

import java.util.List;

public class WebViewEx extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_ex);

        webView = findViewById(R.id.webView);
        webView.loadUrl("http://tung.ipd12.ca/weather");

    }
}
