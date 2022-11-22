package com.example.cardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var cardView : TextView
    lateinit var buttonUp : ImageButton
    lateinit var buttonDown : ImageButton
    lateinit var showCardView : ImageView
    lateinit var showCardView2 : ImageView
    val cardDeck = gameDeck()

    var deckIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardView = findViewById(R.id.showCardTextView)
        buttonUp = findViewById(R.id.imageButtonUp)
        buttonDown = findViewById(R.id.imageButtonDown)
        showCardView = findViewById<ImageView>(R.id.two_Of_HeartsImageView)
        showCardView2 = findViewById<ImageView>(R.id.two_Of_SpadesImageView)




        buttonUp.setOnClickListener {
            showNewCard()
            showCardView
        }

        buttonDown.setOnClickListener {
            showNewCard()
        }












    }

    fun showNewCard() {
        val card = cardDeck.getNewCard()
        cardView.text = card
        //     wordIndex++
        //     val word = wordList[wordIndex]
        //     wordView.text = word.english
    }


}