package com.example.flashcard_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)

        flashcardAnswer.visibility = View.INVISIBLE
        flashcardAnswer2.visibility = View.INVISIBLE
        flashcardAnswer3.visibility = View.INVISIBLE

        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            flashcardAnswer.visibility = View.VISIBLE
            flashcardAnswer2.visibility = View.VISIBLE
            flashcardAnswer3.visibility = View.VISIBLE

        }
        flashcardAnswer.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(resources.getColor(R.color.green, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(resources.getColor(R.color.white, null))

        }
        flashcardAnswer2.setOnClickListener {
            findViewById<View>(R.id.flashcard_answer).setBackgroundColor(resources.getColor(R.color.green, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(resources.getColor(R.color.red, null))

        }

    }
}