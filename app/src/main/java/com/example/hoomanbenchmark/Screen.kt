package com.example.hoomanbenchmark

sealed class Screen(val route: String){
    object StartButton : Screen("start_button")
    object GameList : Screen("game_list")
}