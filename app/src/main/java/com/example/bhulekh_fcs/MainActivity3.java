package com.example.bhulekh_fcs;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CustomWebViewClient client = new CustomWebViewClient(this);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(client);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://fcs.up.gov.in/");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK && this.webView.canGoBack()){
            this.webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

//class CustomWebViewClient extends WebViewClient{
//    private Activity activity;
//    public CustomWebViewClient(Activity activity){
//        this.activity = activity;
//    }
//
//    @Override
//    public boolean shouldOverrideUrlLoading(WebView webView, String url){
//        return false;
//    }
//
//    @Override
//    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest request){
//        return false;
//    }
//}