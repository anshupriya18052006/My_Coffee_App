package com.example.my_coffee_app.presentation.screens.favouritesscreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavouriteScreenTopAppBar(){


    TopAppBar(
        title = {
            Text(
                text = "Favourites",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
    )


}