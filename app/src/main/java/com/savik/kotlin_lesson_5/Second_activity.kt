package com.savik.kotlin_lesson_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var tvMessage = findViewById<TextView>(R.id.tvMessage)
        var i = intent
        if(i != null){
            tvMessage.setText(i.getCharSequenceExtra("salud"))
        }
    }
}