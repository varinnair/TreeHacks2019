package com.example.varin.treehacks2019

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnContOnClick(view: View){
        val intent = Intent(this, PolAffActivity::class.java)
        startActivity(intent)
    }
}
