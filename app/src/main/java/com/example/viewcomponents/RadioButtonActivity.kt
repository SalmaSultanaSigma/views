package com.example.viewcomponents

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.viewcomponents.databinding.ActivityRadioButtonBinding

class RadioButtonActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRadioButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar

        actionBar!!.title="Radio Button Activity"
        actionBar.setDisplayHomeAsUpEnabled(true)




        binding.radioGroup.setOnCheckedChangeListener { radioGroup, checkedId ->
            var rb=findViewById<RadioButton>(checkedId)
            if(rb!=null) {
                binding.tvChoose.setText(rb.text.toString())
                Toast.makeText(applicationContext, "text", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnClear.setOnClickListener {
            binding.radioGroup.clearCheck()
            binding.tvChoose.setText("Choose an option")
        }
        binding.toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            Toast.makeText(this,"button on", Toast.LENGTH_SHORT).show()
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