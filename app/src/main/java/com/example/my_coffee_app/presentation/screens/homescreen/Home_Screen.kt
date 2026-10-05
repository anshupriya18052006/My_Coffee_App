package com.example.my_coffee_app.presentation.screens.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_coffee_app.R
import com.example.my_coffee_app.presentation.screens.ui_components.MyBottomNavBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.my_coffee_app.domain.model.Product


@Composable
fun HomeScreen(navController: NavController){
    val location  = "Janatha Rd, Palarivattom"

    Scaffold(
        bottomBar = { MyBottomNavBar() }
    ){ innerPadding->

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f/3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)
        ){


            //Displaying Products
            val products = listOf(
                Product(id=1, name="Espresso", description = "Strong and rich", price = 2.99, imageRes = R.drawable.coffee_2),
                Product(id=2, name="Cappuccino", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_3),
                Product(id=3, name="Latte", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_1),
                Product(id=4, name="Mocha", description = "Chocolate and milk", price = 3.99, imageRes = R.drawable.coffee_4),
                Product(id=5, name="Macchiato", description = "Espresso and milk", price = 3.99, imageRes = R.drawable.coffee_5),
                Product(id=6, name="Americano", description = "Espresso and hot water", price = 3.99, imageRes = R.drawable.coffee_6),
                Product(id=7, name="Flat White", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_4),
                )

            ProductsGrid(products = products, navController = navController){

                Text(
                    text = "Location",
                    color = Color.Gray,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Text(text = location,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp)

                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Change Location",
                        tint = Color.White

                    )
                }

                Spacer(modifier = Modifier.height(30.dp))

                SearchBar()

                Spacer(modifier = Modifier.height(40.dp))

                Image(
                    painter = painterResource(id = R.drawable.banner_1),
                    contentDescription = "Home Banner"
                )

                Spacer(modifier = Modifier.height(16.dp))

                HomeScreenCategories()

            }
        }
    }

}

