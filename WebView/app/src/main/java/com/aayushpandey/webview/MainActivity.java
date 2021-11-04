package com.aayushpandey.webview;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
//        String url="https://www.youtube.com/";
        webView.loadUrl("https://www.google.com");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        Intent intent=new Intent(Intent.ACTION_VIEW,webView);
//        if(intent.resolveActivity(MainActivity.this.getPackageManager())!=null) {
//            startActivity(intent);
        webView.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String useragent, String contentDisposition, String mimetype, long contentLength) {
                final String filename = URLUtil.guessFileName(url, contentDisposition, mimetype);
                DownloadManager.Request myReq=new DownloadManager.Request(Uri.parse(url));
                myReq.allowScanningByMediaScanner();
                myReq.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                DownloadManager myManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);

                Toast.makeText(MainActivity.this, "downloading", Toast.LENGTH_SHORT).show();
                myReq.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, filename);
                myManager.enqueue(myReq);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
        super.onBackPressed();
    }}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.super_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.back:
                onBackPressed();
                break;

            case R.id.refresh:
                onRefresh();
                break;

            case R.id.forward:
                onForwardPressed();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    private void onForwardPressed(){
        if(webView.canGoForward()){
            webView.goForward();
        }
        else{
            Toast.makeText(this, "Cant go!", Toast.LENGTH_SHORT).show();
        }
    }
    //private class Callback extends WebViewClient {
    //    @Override
      //  public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
        //    return false;
        //}
    //}
    private void onHome(){

        webView.loadUrl("https://www.google.com");
    }
    private void onRefresh(){
        webView.reload();
    }
}