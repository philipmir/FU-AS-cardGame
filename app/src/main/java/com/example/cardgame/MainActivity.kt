package com.example.cardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var cardImageView: ImageView
    lateinit var scoreTextView: TextView
    lateinit var upImageButton: ImageButton
    lateinit var downImageButton: ImageButton

    var scoreCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        cardImageView = findViewById(R.id.cardImageView)
        scoreTextView = findViewById(R.id.scoreTextView)
        upImageButton = findViewById(R.id.upImageButton)
        downImageButton = findViewById(R.id.downImageButton)

        cardImageView.setImageResource(R.drawable.card_back)





        upImageButton.setOnClickListener {
            checkScoreUp()
        }

        downImageButton.setOnClickListener {
            checkScoreDown()

        }





    }

    fun scorePrint () {
        var score = scoreCount
        scoreTextView.text = "$score"
    }

    fun endOfPile() {
        if (fullDeck.fullDeck.size.equals(1)) {

        cardImageView.setImageResource(R.drawable.black_joker)}



        }

    fun checkScoreUp () {
        fullDeck.pickCard()
        if (fullDeck.removeCard.index < fullDeck.currentCard2.index){
            scoreCount++
        }
        cardImageView.setImageResource(fullDeck.currentCard2.graphic)
        scorePrint()
    }

    fun checkScoreDown () {
        fullDeck.pickCard()
        if (fullDeck.removeCard.index > fullDeck.currentCard2.index){
            scoreCount++
        }
        cardImageView.setImageResource(fullDeck.currentCard2.graphic)
        scorePrint()
    }
}








