package com.example.learnaboutyourself.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnaboutyourself.R
import com.example.learnaboutyourself.data.UserDataUiEvents
import com.example.learnaboutyourself.ui.AnimalCard
import com.example.learnaboutyourself.ui.ButtonComponent
import com.example.learnaboutyourself.ui.TextBox
import com.example.learnaboutyourself.ui.TextComponents
import com.example.learnaboutyourself.ui.TopBar
import com.example.learnaboutyourself.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel,
                    showWelcomeScreen: (valuesPair: Pair<String, String>) -> Unit) { // Take this navController host to add new navigation

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TopBar("Hi there 😁")

            TextComponents(
                textValue = "Let's Learn About You!",
                textSize = 24.sp
            )

            Spacer(modifier = Modifier.size(20.dp))

            TextComponents(
                textValue = "This app will prepare a details page based on input provided by you!",
                textSize = 18.sp
            )

            Spacer(modifier = Modifier.size(60.dp))

            TextComponents(textValue = "Name", textSize = 14.sp)

            Spacer(modifier = Modifier.size(10.dp))

            TextBox(
                onTextChanged = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.UserNameEntered(it)
                    )
                }
            )

            Spacer(modifier = Modifier.size(30.dp))

            TextComponents(textValue = "What do you like?", textSize = 15.sp)

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                AnimalCard(image = R.drawable.ic_cat, animalSelected = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.AnimalSelected(it)
                    )
                }, selected = userInputViewModel.uiState.value.animalSelected == "Cat")
                AnimalCard(image = R.drawable.ic_dog, animalSelected = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.AnimalSelected(it)
                    )
                }, selected = userInputViewModel.uiState.value.animalSelected == "Dog")
            }

            Spacer(modifier = Modifier.weight(1F))

            if (userInputViewModel.isValidState()) {
                ButtonComponent(
                    goToDetailsScreen = {
                        showWelcomeScreen(
                            Pair(
                                userInputViewModel.uiState.value.nameEntered,
                                userInputViewModel.uiState.value.animalSelected
                            )
                        )
                    }
                )
            }

        }
    }
}

@Preview
@Composable
fun UserInputScreenPreview() {
//    UserInputScreen(UserInputViewModel(), showWelcomeScreen = Pair("first", "second")
}