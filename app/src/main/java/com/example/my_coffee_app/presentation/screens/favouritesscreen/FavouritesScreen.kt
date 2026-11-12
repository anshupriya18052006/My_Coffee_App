package com.example.my_coffee_app.presentation.screens.favouritesscreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.my_coffee_app.R
import com.example.my_coffee_app.domain.model.Product
import com.example.my_coffee_app.presentation.screens.ui_components.MyBottomNavBar

@Composable
fun FavouritesScreen(navController: NavController){

    var favouriteItems by remember {
        mutableStateOf(listOf(
            Product(id=1, name="Espresso", description = "Strong and rich", price = 2.99, imageRes = R.drawable.coffee_2),
            Product(id=2, name="Cappuccino", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_3),
            Product(id=3, name="Latte", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_1),

            )
        )
    }

    Scaffold(
        topBar = { FavouriteScreenTopAppBar() },
        bottomBar = { MyBottomNavBar(navController, "Favourites") }
    ){ innerpadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerpadding)
        ) {

            item {

                favouriteItems.forEach { product ->
                    FavouritesItemCard(product,
                        onRemove = {favouriteItems = favouriteItems - product}
                    )
                }



            }
        }

    }



}

