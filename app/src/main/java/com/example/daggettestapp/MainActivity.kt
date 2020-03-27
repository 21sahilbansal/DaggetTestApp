package com.example.daggettestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var boltons: Boltons
    @Inject
    lateinit var starks: Starks


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       DaggerBattleComponenets.create().abc(this)
       var war = null

    }
}
