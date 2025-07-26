package com.example.hoomanbenchmark.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hoomanbenchmark.composables.Home
import com.example.hoomanbenchmark.composables.StartButton

@Composable
fun AppNavigation(modifier: Modifier = Modifier.Companion){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {

        composable(route = Screen.Home.route) { Home(navController = navController) }
        composable(route = Screen.StartButton.route) { StartButton(navController = navController) }
    }
}
