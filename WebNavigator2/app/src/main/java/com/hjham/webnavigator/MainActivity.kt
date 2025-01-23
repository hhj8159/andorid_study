package com.hjham.webnavigator

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hjham.webnavigator.ui.theme.WebNavigatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView : WebView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.naver.com")
        webView.settings.javaScriptEnabled = true

        // naver
        findViewById<Button>(R.id.button1).setOnClickListener {
            webView.loadUrl("https://www.naver.com")
        }
        // op.gg
        findViewById<Button>(R.id.button2).setOnClickListener {
            webView.loadUrl("https://op.gg")
        }
        // wow
        findViewById<Button>(R.id.button3).setOnClickListener {
            webView.loadUrl("https://worldofwarcraft.blizzard.com/")
        }
        // react
        findViewById<Button>(R.id.button4).setOnClickListener {
            webView.loadUrl("https://ko.legacy.reactjs.org/")
        }

        // back
        findViewById<Button>(R.id.button5).setOnClickListener {
            webView.goBack()
        }
        // reload
        findViewById<Button>(R.id.button6).setOnClickListener {
            webView.reload()
        }
        // forward
        findViewById<Button>(R.id.button7).setOnClickListener {
            webView.goForward()
        }
    }
}