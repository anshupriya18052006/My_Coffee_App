package com.example.my_coffee_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.my_coffee_app.presentation.screens.detailsscreen.DetailsScreen
import com.example.my_coffee_app.presentation.screens.homescreen.HomeScreen
import com.example.my_coffee_app.presentation.screens.navigation.NavGraph
import com.example.my_coffee_app.presentation.screens.theme.My_Coffee_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My_Coffee_AppTheme {
                NavGraph()
            }
        }
    }
}

