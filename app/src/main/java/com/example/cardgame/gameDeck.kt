package com.example.cardgame

class gameDeck {

    val cardList = mutableListOf<String>()
    lateinit var currentCard : String



    init {
        theWholeDeck()
        getNewCard()
    }





    fun theWholeDeck() {

        cardList.add("2s")
        cardList.add("2h")
        cardList.add("2d")
        cardList.add("2c")

    }


    fun getNewCard(): String {
        val rnd = (0 until cardList.size).random()
        currentCard = cardList[rnd]
        return currentCard
    }


}