package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class table: AppCompatActivity() {
    lateinit var grd : TextView
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.table)
        parseText()
        val intent = Intent(this@table,MainActivity::class.java)
        val btn2 = findViewById<ImageButton>(R.id.btn2) as ImageButton

        btn2.setOnClickListener {
            startActivity(intent)
        }

    }

    fun parseText(){

        val somStr = intent.getStringExtra("XZ") //?: "I don`t know why NULL!!!"
        grd = findViewById(R.id.someText)
        grd.setText(somStr)
    }
}