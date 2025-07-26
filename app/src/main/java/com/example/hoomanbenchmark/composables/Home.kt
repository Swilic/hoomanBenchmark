package com.example.hoomanbenchmark.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hoomanbenchmark.R
import com.example.hoomanbenchmark.navigation.Screen

@Composable
fun Home(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier.weight(1f)
        ) {
            MiniGame("Reaction Time", {
                navController.navigate(Screen.StartButton.route)
            })
            MiniGame("Memory Test", {
                navController.navigate(Screen.StartButton.route)
            })
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top,
            modifier = Modifier.weight(1f)
        ) {
            MiniGame("To Be Updated", {
                navController.navigate(Screen.StartButton.route)
            })
            MiniGame("To Be Updated", {
                navController.navigate(Screen.StartButton.route)
            })
        }
    }
}


@Composable
fun MiniGame(name: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(0.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFd3d3d3)),
        modifier = modifier.size(width = 200.dp, height = 200.dp)
    ) {
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = integerResource(id = R.integer.basicFontSize).sp,
            color = Color.Black
        )
    }
}
