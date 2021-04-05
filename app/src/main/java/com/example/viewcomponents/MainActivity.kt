package com.example.viewcomponents

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.*
import com.example.viewcomponents.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.radioGroup.setOnCheckedChangeListener { radioGroup, checkedId ->
           var rb=findViewById<RadioButton>(checkedId)
           if(rb!=null) {
               binding.textView2.setText(rb.text.toString())
           }
       }
        binding.button2.setOnClickListener {
            binding.radioGroup.clearCheck()
            binding.textView2.setText("Choose an option")
        }
        binding.toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                Toast.makeText(this,"button on", Toast.LENGTH_SHORT).show()
                binding.rootLayout.setBackgroundColor(Color.GRAY)
            }else {
                Toast.makeText(this, "button off", Toast.LENGTH_SHORT).show()
                binding.rootLayout.setBackgroundColor(Color.CYAN)
            }

        }
        binding.switch1.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                binding.switch1.setBackgroundColor(Color.GREEN)
            }else
                binding.switch1.setBackgroundColor(Color.RED)
        }
    }
}