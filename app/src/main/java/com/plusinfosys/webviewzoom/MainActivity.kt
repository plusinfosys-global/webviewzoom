package com.plusinfosys.webviewzoom

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebView: WebView = findViewById(R.id.webview)
        val plus = findViewById<FloatingActionButton>(R.id.plus)
        val minus = findViewById<FloatingActionButton>(R.id.minus)
        myWebView.loadUrl("https://www.google.com")

        plus.setOnClickListener {
            myWebView.zoomIn()
        }
        minus.setOnClickListener {
            myWebView.zoomOut()
        }
    }
}
