package com.maideveloper.kotlinlayouts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun onClick(view: View){
//        val intent=Intent(applicationContext,R.layout.grid_layout)
        setContentView(R.layout.grid_layout)
    }
}
