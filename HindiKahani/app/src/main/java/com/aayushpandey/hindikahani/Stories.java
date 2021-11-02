package com.aayushpandey.hindikahani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Stories extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        webView=findViewById(R.id.webView);
        Intent intent=new Intent();

String urlHindi=getIntent().getStringExtra("Url");
webView.loadUrl(urlHindi);
webView.setWebViewClient(new WebViewClient());

    }
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }}
}