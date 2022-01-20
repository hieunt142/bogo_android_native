package com.xlab.bogovn_native.screens.root

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.xlab.bogovn_native.screens.home.HomeScreen
import com.xlab.bogovn_native.ui.theme.BogoVNTheme

class RootActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BogoVNTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {
                    HomeScreen()
                }
            }

        }
    }
}

@Composable
fun RootScreen(modifier : Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

    }
}

@Composable
fun NavigationGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "home") {
        composable("home") {}
        composable("cart") {}
    }
}

