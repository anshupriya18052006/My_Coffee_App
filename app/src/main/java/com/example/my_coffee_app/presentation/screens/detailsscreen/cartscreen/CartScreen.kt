package com.example.my_coffee_app.presentation.screens.detailsscreen.cartscreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_coffee_app.R
import com.example.my_coffee_app.domain.model.Product

@Preview
@Composable
fun CartScreen(){
    val products = listOf(
        Product(id=1, name="Espresso", description = "Strong and rich", price = 2.99, imageRes = R.drawable.coffee_2),
        Product(id=2, name="Cappuccino", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_3),
        Product(id=3, name="Latte", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_1),
        )

    Scaffold(
        topBar = { CartScreenTopAppBar() }
    ){}
}
