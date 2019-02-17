package com.example.varin.treehacks2019

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.R.id.button3
import android.R.id.button2
import android.R.id.button1
import android.content.Intent


class PolAffActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pol_aff)
    }

    fun onBtnClick(view: View){
        var party = ""

        when (view.id) {
            R.id.btnRep -> {
                party = "Rep"
            }

            R.id.btnDem -> {
                party = "Dem"
            }

            R.id.btnLiber -> {
                party = "Liber"
            }

            R.id.btnOther -> {
                party = "Other"
            }
        }

        val intent = Intent(this, QuestionActivity::class.java)
        intent.putExtra("party", party)
        startActivity(intent)
    }
}
