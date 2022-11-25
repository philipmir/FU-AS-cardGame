package com.example.cardgame




object fullDeck {


    var fullDeck = mutableListOf<Card>()
    var invisPile = mutableListOf<Card>()

    lateinit var  currentCard: Card
    lateinit var  currentCard2 : Card
    lateinit var removeCard: Card


    init {
        invokeCard()
        fullDeck.shuffle()
        //getNewCard()
    }

    fun pickCard (): Card {
        removeCard = fullDeck.removeAt(0)

        currentCard2 = fullDeck[0]

        invisPile.add(currentCard2)

        return removeCard
    }

//    fun getNewCard(): Card {
//        var rnd = (0 until fullDeck.size).random()
//        currentCard = fullDeck[rnd]
//
//        return currentCard
//    }

    fun invokeCard () {

        fullDeck.add(Card("2c", R.drawable.two_of_clubs, 1))
        fullDeck.add(Card("2h", R.drawable.two_of_hearts, 2))
        fullDeck.add(Card("2d", R.drawable.two_of_diamonds, 3))
        fullDeck.add(Card("2s", R.drawable.two_of_spades, 4))
        fullDeck.add(Card("3c", R.drawable.three_of_clubs, 5))
        fullDeck.add(Card("3h", R.drawable.three_of_hearts, 6))
        fullDeck.add(Card("3d", R.drawable.three_of_diamonds, 7))
        fullDeck.add(Card("3s", R.drawable.three_of_spades, 8))
        fullDeck.add(Card("4c", R.drawable.four_of_clubs, 9))
        fullDeck.add(Card("4h", R.drawable.four_of_hearts, 10))
        fullDeck.add(Card("4d", R.drawable.four_of_diamonds, 11))
        fullDeck.add(Card("4s", R.drawable.four_of_spades, 12))
        fullDeck.add(Card("5c", R.drawable.five_of_clubs, 13))
        fullDeck.add(Card("5h", R.drawable.five_of_hearts, 14))
        fullDeck.add(Card("5d", R.drawable.five_of_diamonds, 15))
        fullDeck.add(Card("5s", R.drawable.five_of_spades, 16))
        fullDeck.add(Card("6c", R.drawable.six_of_clubs, 17))
        fullDeck.add(Card("6h", R.drawable.six_of_hearts, 18))
        fullDeck.add(Card("6d", R.drawable.six_of_diamonds, 19))
        fullDeck.add(Card("6s", R.drawable.six_of_spades, 20))
        fullDeck.add(Card("7c", R.drawable.seven_of_clubs, 21))
        fullDeck.add(Card("7h", R.drawable.seven_of_hearts, 22))
        fullDeck.add(Card("7d", R.drawable.seven_of_diamonds, 23))
        fullDeck.add(Card("7s", R.drawable.seven_of_spades, 24))
        fullDeck.add(Card("8c", R.drawable.eight_of_clubs, 25))
        fullDeck.add(Card("8h", R.drawable.eight_of_hearts, 26))
        fullDeck.add(Card("8d", R.drawable.eight_of_diamonds, 27))
        fullDeck.add(Card("8s", R.drawable.eight_of_spades, 28))
        fullDeck.add(Card("9c", R.drawable.nine_of_clubs, 29))
        fullDeck.add(Card("9h", R.drawable.nine_of_hearts,  30))
        fullDeck.add(Card("9d", R.drawable.nine_of_diamonds,  31))
        fullDeck.add(Card("9s", R.drawable.nine_of_spades,  32))
        fullDeck.add(Card("10c", R.drawable.ten_of_clubs, 33))
        fullDeck.add(Card("10h", R.drawable.ten_of_hearts, 34))
        fullDeck.add(Card("10d", R.drawable.ten_of_diamonds, 35))
        fullDeck.add(Card("10s", R.drawable.ten_of_spades, 36))
        fullDeck.add(Card("Jc", R.drawable.jack_of_clubs, 37))
        fullDeck.add(Card("Jh", R.drawable.jack_of_hearts, 38))
        fullDeck.add(Card("Jd", R.drawable.jack_of_diamonds, 39))
        fullDeck.add(Card("Js", R.drawable.jack_of_spades, 40))
        fullDeck.add(Card("Qc", R.drawable.queen_of_clubs, 41))
        fullDeck.add(Card("Qh", R.drawable.queen_of_hearts, 42))
        fullDeck.add(Card("Qd", R.drawable.queen_of_diamonds, 43))
        fullDeck.add(Card("Qs", R.drawable.queen_of_spades, 44))
        fullDeck.add(Card("Kc", R.drawable.king_of_clubs, 45))
        fullDeck.add(Card("Kh", R.drawable.king_of_hearts, 46))
        fullDeck.add(Card("Kd", R.drawable.king_of_diamonds, 47))
        fullDeck.add(Card("Ks", R.drawable.king_of_spades, 48))
        fullDeck.add(Card("Ac", R.drawable.ace_of_clubs, 49))
        fullDeck.add(Card("Ah", R.drawable.ace_of_hearts, 50))
        fullDeck.add(Card("Ad", R.drawable.ace_of_diamonds, 51))
        fullDeck.add(Card("As", R.drawable.ace_of_spades, 52))

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




