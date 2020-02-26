package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var edtxt1: EditText
    lateinit var edtxt2: EditText
    lateinit var edtxt3: EditText
    lateinit var edtxt4: EditText
    lateinit var btn1: ImageButton
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtxt1 = findViewById(R.id.edt1)
        edtxt2 = findViewById(R.id.edt2)
        edtxt3 = findViewById(R.id.edt3)
        edtxt4 = findViewById(R.id.edt4)
        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {

            calculateTip()
        }
    }
    private fun calculateTip(){
        val a = edtxt2.text.toString().toDouble()
        val b = edtxt3.text.toString().toDouble()
        val c = edtxt4.text.toString().toDouble()
        val d = edtxt1.text.toString()
        val res = a+b+c
        val intent = Intent(this@MainActivity, table::class.java)
        intent.putExtra("XZ", d)
        startActivity(intent)
    }
}
