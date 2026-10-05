package com.example.my_coffee_app.presentation.screens.detailsscreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.my_coffee_app.R
import com.example.my_coffee_app.domain.model.Product


@Composable
fun DetailsScreen(
    productId: Int, navController: NavController
){

    val products = listOf(
        Product(id=1, name="Espresso", description = "Strong and rich", price = 2.99, imageRes = R.drawable.coffee_2),
        Product(id=2, name="Cappuccino", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_3),
        Product(id=3, name="Latte", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_1),
        Product(id=4, name="Mocha", description = "Chocolate and milk", price = 3.99, imageRes = R.drawable.coffee_4),
        Product(id=5, name="Macchiato", description = "Espresso and milk", price = 3.99, imageRes = R.drawable.coffee_5),
        Product(id=6, name="Americano", description = "Espresso and hot water", price = 3.99, imageRes = R.drawable.coffee_6),
        Product(id=7, name="Flat White", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_4),
    )

    val selectedProduct = products.find{it.id==productId}

    if(selectedProduct == null){
        Text(text = "Product not found!", color = Color.Red)
        return
    }


    Scaffold(

        topBar = { DetailsScreenTopAppBar() },
        bottomBar = { DetailsScreenBottomBar() }
    ){ innerPadding->

        LazyColumn{
            item{

                ProductDetailsContent(
                    selectedProduct,
                    innerPadding

                )


            }

        }


    }

}


