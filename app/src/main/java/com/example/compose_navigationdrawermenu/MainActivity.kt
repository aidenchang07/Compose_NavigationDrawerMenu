package com.example.compose_navigationdrawermenu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.compose_navigationdrawermenu.ui.screens.MainScreen
import com.example.compose_navigationdrawermenu.ui.theme.Compose_NavigationDrawerMenuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_NavigationDrawerMenuTheme {
                MainScreen()
            }
        }
    }
}