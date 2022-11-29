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
    lateinit var pinkTextImageView: ImageView

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
            pinkTextImageView = findViewById(R.id.pinkTextImageView)






            cardImageView.setImageResource(R.drawable.card_back)





            upImageButton.setOnClickListener {
                if (fullDeck.fullDeckList.size.equals(1)) {
                    endOfPile()
                }else {
                    fullDeck.pickCard()
                    checkScoreUp()
                }
            }

            downImageButton.setOnClickListener {
                if (fullDeck.fullDeckList.size.equals(1) ) {
                    endOfPile()
                }else {
                    fullDeck.pickCard()
                    checkScoreDown()
                }
            }

            cardImageView.setOnClickListener {
                replayGame()
                scoreCount = 0
                scorePrint()
                cardImageView.setImageResource(R.drawable.card_back)
                pinkTextImageView.setImageResource(R.drawable.pinktext)

            }
    }


    fun scorePrint () {
        var score = scoreCount
        scoreTextView.text = score.toString()
    }

    fun endOfPile() {

        if (fullDeck.fullDeckList.size.equals(1)) {

            cardImageView.setImageResource(R.drawable.newgamecard)

            pinkTextImageView.setImageResource(R.drawable.gameover)

        }
    }

    fun checkScoreUp () {


        if (fullDeck.notCurrentCard.value < fullDeck.currentCard.value){
            scoreCount++
        }
        cardImageView.setImageResource(fullDeck.currentCard.graphic)
        scorePrint()
        }


    fun checkScoreDown () {

        if (fullDeck.notCurrentCard.value > fullDeck.currentCard.value){
            scoreCount++
        }
        cardImageView.setImageResource(fullDeck.currentCard.graphic)
        scorePrint()
    }

    fun replayGame(){
//        invisPile.add(currentCard)

        fullDeck.fullDeckList.removeAll(fullDeck.fullDeckList)
        fullDeck.removedCardList.removeAll(fullDeck.removedCardList)
        fullDeck.invokeCard()
        fullDeck.fullDeckList.shuffle()
    }


    fun timerStuff () {


    }






}













