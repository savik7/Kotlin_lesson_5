package com.savik.kotlin_lesson_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickStart(view: View){
        var message = "Привет с Майнактивити"
        var intent = Intent(this, Second_activity::class.java).apply {
            putExtra("salud", message) //передаем данные во второе окно
        }
        startActivity(intent)
    }
}