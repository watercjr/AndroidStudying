package com.example.webviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.web_view);
        // 让WebView支持JavaScript脚本
        webView.getSettings().setJavaScriptEnabled(true);
        // 作用是：当需要从一个网页跳转到另一个网页时，目标网页仍停留在当前WebView中显示，而不是打开系统浏览器
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.baidu.com");
    }
}
