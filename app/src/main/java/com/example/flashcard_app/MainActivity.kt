package com.example.flashcard_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var isShowingAnswers: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)
        val toggleChoicesVisibility = findViewById<ImageView>(R.id.toggle_choices_visibility)


//        flashcardAnswer.visibility = View.INVISIBLE
//        flashcardAnswer2.visibility = View.INVISIBLE
//        flashcardAnswer3.visibility = View.INVISIBLE

        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
//            flashcardAnswer.visibility = View.VISIBLE
//            flashcardAnswer2.visibility = View.VISIBLE
//            flashcardAnswer3.visibility = View.VISIBLE

        }
        flashcardAnswer.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(resources.getColor(R.color.green, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(resources.getColor(R.color.pinK, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(resources.getColor(R.color.pinK, null))

        }
        flashcardAnswer2.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(resources.getColor(R.color.green, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(resources.getColor(R.color.red, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(resources.getColor(R.color.pinK, null))

        }
        flashcardAnswer3.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(resources.getColor(R.color.green, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(resources.getColor(R.color.pinK, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(resources.getColor(R.color.red, null))

        }
        toggleChoicesVisibility.setOnClickListener {
            isShowingAnswers = !isShowingAnswers

            if (isShowingAnswers) {
                toggleChoicesVisibility.setImageResource(R.drawable.icon_eye)
                flashcardAnswer.visibility = View.VISIBLE
                flashcardAnswer2.visibility = View.VISIBLE
                flashcardAnswer3.visibility = View.VISIBLE

                // Set the flashcards_answers background to their initial color
                findViewById<View>(R.id.flashcard_answer).setBackgroundColor(resources.getColor(R.color.pinK, null))
                findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(resources.getColor(R.color.pinK, null))
                findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(resources.getColor(R.color.pinK, null))
            } else {
                toggleChoicesVisibility.setImageResource(R.drawable.icon_eye)
                flashcardAnswer.visibility = View.INVISIBLE
                flashcardAnswer2.visibility = View.INVISIBLE
                flashcardAnswer3.visibility = View.INVISIBLE

                // Set the flashcards_answers background to their initial color
                findViewById<View>(R.id.flashcard_answer).setBackgroundColor(resources.getColor(R.color.pinK, null))
                findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(resources.getColor(R.color.pinK, null))
                findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(resources.getColor(R.color.pinK, null))
            }
        }

    }
}