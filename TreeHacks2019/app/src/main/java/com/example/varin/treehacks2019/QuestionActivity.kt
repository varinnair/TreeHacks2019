package com.example.varin.treehacks2019

import android.content.Intent
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {
    private var party = ""
    private var allQuestions: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val intent = getIntent()
        party = intent.getStringExtra("party")

        allQuestions.add("Question A")
        allQuestions.add("Question B")
        allQuestions.add("Question C")
        allQuestions.add("Question D")

        var randomQues: String = allQuestions.random()
        questionTxt.setText(randomQues)
    }

    fun getResponse(view: View){
        var response = ""

        when (view.id) {
            R.id.btnYes -> {
                party = "Y"
            }

            R.id.btnNo -> {
                party = "N"
            }
        }

        val intent = Intent(this, QuestionActivity::class.java)
        intent.putExtra("response", response)
        startActivity(intent)
    }
}
