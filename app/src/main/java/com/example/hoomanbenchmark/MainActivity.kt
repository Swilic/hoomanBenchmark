package com.example.hoomanbenchmark

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hoomanbenchmark.ui.theme.HoomanBenchMarkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HoomanBenchMarkTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation(modifier: Modifier = Modifier){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.GameList.route) {

        composable(route = Screen.GameList.route) { GameLists(navController = navController) }
        composable(route = Screen.StartButton.route) { StartButton(navController = navController) }
    }
}


@Preview(showBackground = true)
@Composable
fun StartButtonPreview() {
    HoomanBenchMarkTheme {
        AppNavigation()
    }
}

@Composable
fun GameLists(navController: NavController, modifier: Modifier = Modifier) {
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
            fontSize = 24.sp,
            color = Color.Black
        )
    }
}


@Composable
fun StartButton(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = { navController.navigate(Screen.GameList.route) },
            shape = RoundedCornerShape(17.dp),
            modifier = Modifier.size(width = 250.dp, height = 150.dp)
        ) {
            Text(stringResource(R.string.play), fontSize = 24.sp)
        }
    }
}

