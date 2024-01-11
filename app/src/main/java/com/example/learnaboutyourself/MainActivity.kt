package com.example.learnaboutyourself

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnaboutyourself.ui.screens.FunFactsNavigationGraph
import com.example.learnaboutyourself.ui.screens.Routes
import com.example.learnaboutyourself.ui.screens.UserInputScreen
import com.example.learnaboutyourself.ui.screens.WelcomeScreen
import com.example.learnaboutyourself.ui.theme.LearnAboutYourselfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnAboutYourselfTheme {
                FunFactsApp()
            }
        }
    }

    @Composable
    fun FunFactsApp() {
        FunFactsNavigationGraph()
    }
}


