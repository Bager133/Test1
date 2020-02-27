package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
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
          if (TextUtils.isEmpty(edtxt1.text.toString()) or TextUtils.isEmpty(edtxt2.text.toString()) or TextUtils.isEmpty(edtxt3.text.toString()) or TextUtils.isEmpty(edtxt4.text.toString()))
             Toast.makeText(this@MainActivity, "Заповніть всі дані", Toast.LENGTH_SHORT).show();
          else
            calculateTip()
        }
    }
    private fun calculateTip(){
        val d = edtxt1.text.toString()
        val intent = Intent(this@MainActivity, table::class.java)
        intent.putExtra("XZ", d)

        startActivity(intent)
    }
}
