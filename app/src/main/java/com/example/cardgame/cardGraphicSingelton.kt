package com.example.cardgame




object cardGraphicSingelton {


    val cardList = mutableListOf<CardPair>()
    var hiddenCardIndexList = mutableListOf<Int>()

    lateinit var currentCard: CardPair


    init {
        initlizeWord()
        getNewCard()
        initilizeHiddenCard()
//                fullDeckofCards()
    }

    fun initlizeWord() {
        //val card = CardPair("H", 2)
        // cardList.add(card)
        cardList.add(CardPair("2c", 2))
        cardList.add(CardPair("2h", 2))
        cardList.add(CardPair("2d", 2))
        cardList.add(CardPair("2s", 2))
        cardList.add(CardPair("3c", 3))
        cardList.add(CardPair("3h", 3))
        cardList.add(CardPair("3d", 3))
        cardList.add(CardPair("3s", 3))
        cardList.add(CardPair("4c", 4))
        cardList.add(CardPair("4h", 4))
        cardList.add(CardPair("4d", 4))
        cardList.add(CardPair("4s", 4))
        cardList.add(CardPair("5c", 5))
        cardList.add(CardPair("5h", 5))
        cardList.add(CardPair("5d", 5))
        cardList.add(CardPair("5s", 5))
        cardList.add(CardPair("6c", 6))
        cardList.add(CardPair("6h", 6))
        cardList.add(CardPair("6d", 6))
        cardList.add(CardPair("6s", 6))
        cardList.add(CardPair("7c", 7))
        cardList.add(CardPair("7h", 7))
        cardList.add(CardPair("7d", 7))
        cardList.add(CardPair("7s", 7))
        cardList.add(CardPair("8c", 8))
        cardList.add(CardPair("8h", 8))
        cardList.add(CardPair("8d", 8))
        cardList.add(CardPair("8s", 8))
        cardList.add(CardPair("9c", 9))
        cardList.add(CardPair("9h", 9))
        cardList.add(CardPair("9d", 9))
        cardList.add(CardPair("9s", 9))
        cardList.add(CardPair("10c", 10))
        cardList.add(CardPair("10h", 10))
        cardList.add(CardPair("10d", 10))
        cardList.add(CardPair("10s", 10))
        cardList.add(CardPair("Jc", 11))
        cardList.add(CardPair("Jh", 11))
        cardList.add(CardPair("Jd", 11))
        cardList.add(CardPair("Js", 11))
        cardList.add(CardPair("Qc", 12))
        cardList.add(CardPair("Qh", 12))
        cardList.add(CardPair("Qd", 12))
        cardList.add(CardPair("Qs", 12))
        cardList.add(CardPair("Kc", 13))
        cardList.add(CardPair("Kh", 13))
        cardList.add(CardPair("Kd", 13))
        cardList.add(CardPair("Ks", 13))
        cardList.add(CardPair("Ac", 14))
        cardList.add(CardPair("Ah", 14))
        cardList.add(CardPair("Ad", 14))
        cardList.add(CardPair("As", 14))



    }



    fun initilizeHiddenCard () {
        hiddenCardIndexList.add(getNewCard().index)
    }

    fun getNewCard(): CardPair {
        var rnd = (0 until cardList.size).random()
        currentCard = cardList[rnd]

        return currentCard
    }

}



/*var fullDeck = mutableListOf<ImageView>()


fun fullDeckofCards() {

        fullDeck.add(R.drawable.ace_of_clubs)
        fullDeck.add(R.drawable.ace_of_diamonds)
        fullDeck.add(R.drawable.ace_of_hearts)
        fullDeck.add(R.drawable.ace_of_spades)
        fullDeck.add(R.drawable.ace_of_clubs)
        fullDeck.add(R.drawable.ace_of_diamonds)
        fullDeck.add(R.drawable.ace_of_hearts)
        fullDeck.add(R.drawable.ace_of_spades)
        fullDeck.add(R.drawable.jack_of_clubs)
        fullDeck.add(R.drawable.jack_of_diamonds)
        fullDeck.add(R.drawable.jack_of_hearts)
        fullDeck.add(R.drawable.jack_of_spades)
        fullDeck.add(R.drawable.queen_of_clubs)
        fullDeck.add(R.drawable.queen_of_diamonds)
        fullDeck.add(R.drawable.queen_of_hearts)
        fullDeck.add(R.drawable.queen_of_spades)
        fullDeck.add(R.drawable.king_of_clubs)
        fullDeck.add(R.drawable.king_of_diamonds)
        fullDeck.add(R.drawable.king_of_hearts)
        fullDeck.add(R.drawable.king_of_spades)
        fullDeck.add(R.drawable.nine_of_clubs)
        fullDeck.add(R.drawable.nine_of_diamonds)
        fullDeck.add(R.drawable.nine_of_hearts)
        fullDeck.add(R.drawable.nine_of_spades)
        fullDeck.add(R.drawable.eight_of_clubs)
        fullDeck.add(R.drawable.eight_of_diamonds)
        fullDeck.add(R.drawable.eight_of_hearts)
        fullDeck.add(R.drawable.eight_of_spades)
        fullDeck.add(R.drawable.seven_of_clubs)
        fullDeck.add(R.drawable.seven_of_diamonds)
        fullDeck.add(R.drawable.seven_of_hearts)
        fullDeck.add(R.drawable.seven_of_spades)
        fullDeck.add(R.drawable.six_of_clubs)
        fullDeck.add(R.drawable.six_of_diamonds)
        fullDeck.add(R.drawable.six_of_hearts)
        fullDeck.add(R.drawable.six_of_spades)
        fullDeck.add(R.drawable.five_of_clubs)
        fullDeck.add(R.drawable.five_of_diamonds)
        fullDeck.add(R.drawable.five_of_hearts)
        fullDeck.add(R.drawable.five_of_spades)
        fullDeck.add(R.drawable.four_of_clubs)
        fullDeck.add(R.drawable.four_of_diamonds)
        fullDeck.add(R.drawable.four_of_hearts)
        fullDeck.add(R.drawable.four_of_spades)
        fullDeck.add(R.drawable.three_of_clubs)
        fullDeck.add(R.drawable.three_of_diamonds)
        fullDeck.add(R.drawable.three_of_hearts)
        fullDeck.add(R.drawable.three_of_spades)
        fullDeck.add(R.drawable.two_of_clubs)
        fullDeck.add(R.drawable.two_of_diamonds)
        fullDeck.add(R.drawable.two_of_hearts)
        fullDeck.add(R.drawable.two_of_spades)


}



}

private fun <E> MutableList<E>.add(element: Int) {

}*/




