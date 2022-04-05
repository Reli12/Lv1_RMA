package com.example.lv_1_dorijanpolanc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView1 = findViewById<TextView>(R.id.firstView)
        val textView2= findViewById<TextView>(R.id.secondView)
        val editText1=findViewById<EditText>(R.id.editTextTextPersonName)
        val editText2=findViewById<EditText>(R.id.editTextTextPersonDescription)
        val editText3=findViewById<EditText>(R.id.editTextTextPersonHeight)
        val first=editText3.text.toString().toFloat()
        val editText4=findViewById<EditText>(R.id.editTextTextPersonWeight)
        val second=editText3.text.toString().toFloat()
        val res=findViewById<TextView>(R.id.resault1)
        val Res1=second/(first*first)
        findViewById<Button>(R.id.firstButton).setOnClickListener {
           textView1.text=editText1.text
            textView2.text=editText2.text
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            res.text=Res1.toString()
        }

    }
}