package com.example.cardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var cardTextView : TextView
    lateinit var scoreTextView: TextView
    lateinit var graphicuImageView: ImageView
    lateinit var buttonUp : ImageButton
    lateinit var buttonDown : ImageButton


    var scoreCount = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        

        cardTextView = findViewById(R.id.showCardTextView)
        scoreTextView = findViewById(R.id.scoreTextView)
        graphicuImageView = findViewById(R.id.graphicImageView)
        buttonUp = findViewById(R.id.imageButtonUp)
        buttonDown = findViewById(R.id.imageButtonDown)








        buttonUp.setOnClickListener {
            showNewCard()
            showNewScoreUp()

//            scoreUpdate()
//            showCardFromList()



        }

        buttonDown.setOnClickListener {
            showNewCard()
            showNewScoreDown()
        }



    }

    fun showNewCard() {
        val card = cardGraphicSingelton.getNewCard()
        cardTextView.text = card.card

        //     wordIndex++
        //     val word = wordList[wordIndex]
        //     wordView.text = word.english
    }



    fun showNewScoreUp () {
        val score = higherGuess()
        scoreTextView.text = score.toString()
    }
    fun showNewScoreDown () {
        val score = lowerGuess()
        scoreTextView.text = score.toString()
    }

    fun higherGuess() : Int {
        var card = cardGraphicSingelton.getNewCard().index

        if (card >= cardGraphicSingelton.hiddenCardIndexList.lastIndex) {
            scoreCount++
        }
        return scoreCount
    }

        fun lowerGuess() : Int  {
            var card = cardGraphicSingelton.getNewCard().index

            if (card <= cardGraphicSingelton.hiddenCardIndexList.lastIndex) {
                scoreCount++
            }
            return scoreCount





        //textViewUpdater()
    }
//    fun guessLowerOnclick() {
//        var card = showNewCard()
//
//        if (card <= cardGraphicSingelton.hiddenCardList[1].number) {
//            rightAnswer++
//        } else {
//            wrongAnswerLeft--
//        }
//        textViewUpdater()
//    }



    /*fun scoreUpdate () {
        var scoreu = cardGraphicSingelton.scoreCount()
        scoreTextView.text = scoreu.toString()
    }*/

//    fun showCardFromList () {
//        var imageu = cardGraphicSingelton.cardList.size
//        graphicuImageView.setImageResource(imageu)
//
//
//    }

    fun indexCardList () {
        var index = cardGraphicSingelton.cardList.size


    }
}




/*    fun cardIndexstuff (): Int {
        val cardIndex = cardGraphicSingelton.cardList.size
        return cardIndex

    }*/

    /*fun showNewIndex () {
        val index = cardIndexstuff()
        scoreTextView.text = index.toString()
    }*/









