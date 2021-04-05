package com.example.viewcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.viewcomponents.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkbill.setOnClickListener {
            var totalbill= 0
            if(binding.pizza.isChecked)
                totalbill+=3
            if(binding.hotdog.isChecked)
                totalbill+=1
            if(binding.burger.isChecked)
                totalbill+=2

            binding.textView.setText("Total bill is: "+ totalbill.toString())
        }
    }
}