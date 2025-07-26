package com.example.hoomanbenchmark.navigation

sealed class Screen(val route: String){
    object StartButton : Screen("start_button")
    object Home : Screen("Home")
}