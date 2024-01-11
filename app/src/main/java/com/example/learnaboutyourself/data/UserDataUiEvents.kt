package com.example.learnaboutyourself.data

sealed class UserDataUiEvents {
    data class UserNameEntered(val name:String) : UserDataUiEvents()
    data class AnimalSelected(val animalValue:String) : UserDataUiEvents()
}

// Using sealed class because there are only two possibilities for the bottom button to appear.