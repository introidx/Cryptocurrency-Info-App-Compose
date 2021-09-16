package com.introid.cryptocurrencyinfoappcompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.introid.cryptocurrencyinfoappcompose.presentation.ui.theme.CryptocurrencyInfoAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyInfoAppComposeTheme {

            }
        }
    }
}