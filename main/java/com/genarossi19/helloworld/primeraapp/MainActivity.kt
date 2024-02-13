package com.genarossi19.helloworld.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.genarossi19.helloworld.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}