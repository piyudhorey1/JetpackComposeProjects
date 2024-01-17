package com.example.learnaboutyourself.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.learnaboutyourself.ui.FactsComposable
import com.example.learnaboutyourself.ui.FactsViewModel
import com.example.learnaboutyourself.ui.TextComponents
import com.example.learnaboutyourself.ui.TextWithShadow
import com.example.learnaboutyourself.ui.TopBar

@Composable
fun WelcomeScreen(username: String?, animalSelected: String?) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar(value = "Welcome $username 🤗")

            TextComponents(textValue = "Thank you! For sharing your data ", textSize = 24.sp)

            Spacer(modifier = Modifier.size(60.dp))

            val finalText = if (animalSelected == "Cat") "You have selected a Cat 🐱" else "You have selected a Dog 🐶"

            TextWithShadow(value = finalText)

            Spacer(modifier = Modifier.size(40.dp))

            val factsViewModel: FactsViewModel = viewModel()
            FactsComposable(value = factsViewModel.generateRandomFact(animalSelected!!))
        }
    }
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen("username", "animalSelected")
}