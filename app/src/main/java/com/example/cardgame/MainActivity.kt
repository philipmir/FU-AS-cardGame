package com.example.cardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
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
        //hiding the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)



            cardImageView = findViewById(R.id.cardImageView)
            scoreTextView = findViewById(R.id.scoreTextView)
            upImageButton = findViewById(R.id.upImageButton)
            downImageButton = findViewById(R.id.downImageButton)

            cardImageView.setImageResource(R.drawable.card_back)





            upImageButton.setOnClickListener {
                fullDeck.pickCard()
                checkScoreUp()



            }

            downImageButton.setOnClickListener {
                fullDeck.pickCard()
                checkScoreDown()


            }


    }

    fun scorePrint () {
        var score = scoreCount
        scoreTextView.text = score.toString()
    }

//    fun endOfPile() {
//
//        if (fullDeck.fullDeck.size.equals(1)) {
//
//            fullDeck.replayGame()
//
//
//
//        }
//    }

    fun checkScoreUp () {


        if (fullDeck.removeCard.value < fullDeck.currentCard2.value){
            scoreCount++
        }
        cardImageView.setImageResource(fullDeck.currentCard2.graphic)
        scorePrint()
        }


    fun checkScoreDown () {

        if (fullDeck.removeCard.value > fullDeck.currentCard2.value){
            scoreCount++
        }
        cardImageView.setImageResource(fullDeck.currentCard2.graphic)
        scorePrint()
    }

}












