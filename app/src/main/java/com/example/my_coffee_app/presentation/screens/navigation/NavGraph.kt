package com.example.my_coffee_app.presentation.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.my_coffee_app.presentation.screens.detailsscreen.DetailsScreen
import com.example.my_coffee_app.presentation.screens.detailsscreen.cartscreen.CartScreen
import com.example.my_coffee_app.presentation.screens.favouritesscreen.FavouritesScreen
import com.example.my_coffee_app.presentation.screens.homescreen.HomeScreen
import com.example.my_coffee_app.presentation.screens.profilescreen.ProfileScreen
import com.example.my_coffee_app.presentation.screens.welcomescreen.WelcomeScreen

@Composable
fun NavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.WelcomeScreen) {
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }

        composable<Routes.DetailsScreen> { backStackEntry ->
            val args = backStackEntry.toRoute<Routes.DetailsScreen>()
            DetailsScreen(
                navController = navController,productId = args.productId)
        }

        composable<Routes.CartScreen> {
            CartScreen(navController)
        }

        composable<Routes.FavouritesScreen> {
            FavouritesScreen(navController)
        }

        composable<Routes.ProfileScreen> {
            ProfileScreen(navController)
        }
    }
}
