package com.example.learnaboutyourself.ui

import androidx.lifecycle.ViewModel

class FactsViewModel : ViewModel() {

    fun generateRandomFact(selectedAnimal: String) : String {
        return if (selectedAnimal == "Dog"){
            getDogFacts().random()
        }else {
            getCatFacts().random()
        }
    }

    fun getDogFacts(): List<String> {
        val dogFacts  = listOf(
            "The Labrador Retriever has been on the AKC’s top 10 most popular breeds list for longer than any other breed.",
            "A dog’s nose print is unique, much like a person’s fingerprint.",
            "Forty-five percent of U.S. dogs sleep in their owner’s beds.",
            "Speaking of sleeping … all dogs dream, but puppies and senior dogs dream more frequently than adult dogs.",
            "Seventy percent of people sign their dog’s name on their holiday cards.",
            "A dog’s sense of smell is legendary, but did you know that their nose has as many as 300 million receptors? In comparison, a human nose has about 5 million.",
            "Rin Tin Tin, the famous German Shepherd Dog, was nominated for an Academy Award.",
            "The Australian Shepherd is not actually from Australia. In fact, they are an American breed."
        )

        return dogFacts
    }

    fun getCatFacts(): List<String> {
        val catFacts = listOf(
            "Not all kitties go crazy for catnip—most scientists believe this is an inherited trait.",
            "Since 1994, various types of Persians have won Best in Show at the CFA International Cat Show a whopping 17 times.",
            "The average healthy kitty can jump several feet high and wide. Waffle the Warrior Cat is the current Guinness World Record holder, reaching a laudable leap of 7 feet.",
            "Some behavior experts believe cats vocalize over 20 distinct sounds with various meanings.",
            "The only cat to travel into space was a black-and-white stray named Félicette in 1963.",
            "Ancient Egyptians revered black cats because of their resemblance to the goddess Bastet.",
            "Cats spend about 15–20 hours a day resting or sleeping."
        )

        return catFacts
    }
}