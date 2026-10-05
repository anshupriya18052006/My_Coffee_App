package com.example.my_coffee_app.presentation.screens.navigation


import kotlinx.serialization.Serializable
sealed class Routes {


    @Serializable
    object WelcomeScreen : Routes()

    @Serializable
    object HomeScreen : Routes()

    @Serializable
    data class DetailsScreen(val product: Int) : Routes() {
        val productId: Any
    }
}