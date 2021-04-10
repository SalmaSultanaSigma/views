package com.example.viewcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.viewcomponents.databinding.ActivityMainBinding
import com.example.viewcomponents.databinding.ActivityRatingBarAndSeekBarBinding

class RatingBarAndSeekBar : AppCompatActivity() {
    private lateinit var binding: ActivityRatingBarAndSeekBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRatingBarAndSeekBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar= supportActionBar
        actionBar!!.title= "RatingBar And SeekBar Activity"
        actionBar.setDisplayHomeAsUpEnabled(true)

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            binding.tvRatingBar.setText("Rating: $rating")
        }
        binding.seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.tvSeekbar.setText("Value: $progress")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
    }
}