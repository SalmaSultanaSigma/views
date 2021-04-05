package com.example.viewcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.FocusFinder
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b=findViewById<Button>(R.id.button)
        val mytext=findViewById<TextView>(R.id.textView)
        val edit=findViewById<EditText>(R.id.editTextNumber)
        val edit2=findViewById<EditText>(R.id.editTextNumber2)

        b.setOnClickListener {
            mytext.text="resuts: "+(edit.text.toString().toInt()+edit2.text.toString().toInt()).toString()
            Toast.makeText(this, "result: "+mytext.text.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}