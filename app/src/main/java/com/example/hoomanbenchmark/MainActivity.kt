package com.example.hoomanbenchmark

import com.example.hoomanbenchmark.navigation.AppNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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




@Preview(showBackground = true)
@Composable
fun StartButtonPreview() {
    HoomanBenchMarkTheme {
        AppNavigation()
    }
}




