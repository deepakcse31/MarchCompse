package com.example.marchcompse

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavController(){

    val navController = rememberNavController()
    NavHost(navController=navController, startDestination = "home"){

        composable("home"){
            HomeScreen(navController)
        }
        composable("details"){
            DetailsScreen()
        }
        composable("listScreen"){
            List()
        }
    }
}