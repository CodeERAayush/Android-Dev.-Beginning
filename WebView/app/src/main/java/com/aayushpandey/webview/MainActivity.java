package com.aayushpandey.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        String url="https://technicalacademyplus.blogspot.com/";
        webView.loadUrl(url);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        Intent intent=new Intent(Intent.ACTION_VIEW,webView);
//        if(intent.resolveActivity(MainActivity.this.getPackageManager())!=null) {
//            startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
        super.onBackPressed();
    }}

    //private class Callback extends WebViewClient {
    //    @Override
      //  public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
        //    return false;
        //}
    //}
}