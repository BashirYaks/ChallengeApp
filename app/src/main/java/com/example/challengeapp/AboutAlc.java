package com.example.challengeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //adds webview.
        WebView webView = new WebView(this);

        super.onCreate(savedInstanceState);
        //i decided to use this instead of the layout file
        setContentView(webView);

        //adds the url
        webView.loadUrl("https://andela.com/alc/");

        //adds javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

        //Adds back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
