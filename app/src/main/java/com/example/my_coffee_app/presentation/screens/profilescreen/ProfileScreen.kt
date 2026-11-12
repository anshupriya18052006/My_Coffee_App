package com.example.my_coffee_app.presentation.screens.profilescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.my_coffee_app.presentation.screens.favouritesscreen.ProfileScreenTopAppBar
import com.example.my_coffee_app.presentation.screens.navigation.Routes
import com.example.my_coffee_app.presentation.screens.theme.LightBrown
import com.example.my_coffee_app.presentation.screens.theme.LightGray
import com.example.my_coffee_app.presentation.screens.ui_components.MyBottomNavBar


@Composable
fun ProfileScreen(navController: NavHostController) {

    Scaffold(
        topBar = { ProfileScreenTopAppBar() },
        bottomBar = {MyBottomNavBar(navController, "Profile") }
    ){ innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding),

            ){
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                        .background(
                            color = LightBrown.copy(alpha = 0.15f)
                        ),
                    contentAlignment = Alignment.Center
                ){
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(80.dp),
                        tint = LightBrown

                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Anshu Priya",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                )


                Text(text = "anshupriya54008@gmail.com",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.DarkGray
                )
            }

            Spacer(modifier = Modifier.height(56.dp))

            Text(text = "Address",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold
            )


            Text(text = "AIT Pune,\nAlandi Rd,\nDighi Hills, Pune",
                style = MaterialTheme.typography.titleMedium,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.width(50.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = LightGray.copy(alpha = 0.5f))
            ){
                Column(
                    modifier = Modifier.padding(30.dp)
                ){
                    Row(
                        modifier = Modifier.fillMaxWidth().clickable { navController.navigate(Routes.CartScreen) },
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Cart",
                            tint = LightBrown,
                            modifier = Modifier.size(28.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Cart",
                            fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable { navController.navigate(Routes.FavouritesScreen) },
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = LightBrown,
                            modifier = Modifier.size(28.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Favourites",
                            fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable{},
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Settings",
                            tint = LightBrown,
                            modifier = Modifier.size(28.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Settings",
                            fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth().clickable{},
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Default.WbSunny,
                            contentDescription = "Theme",
                            tint = LightBrown,
                            modifier = Modifier.size(28.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Change Theme",
                            fontSize = 18.sp)
                    }

                }
            }

        }
    }



}
