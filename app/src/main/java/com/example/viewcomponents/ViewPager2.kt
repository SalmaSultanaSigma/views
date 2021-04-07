package com.example.viewcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewcomponents.databinding.ActivityMainBinding
import com.example.viewcomponents.databinding.ActivityViewPager2Binding

class ViewPager2 : AppCompatActivity() {
    private lateinit var binding: ActivityViewPager2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title="View Pager 2"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val images= listOf(
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight
        )
        val adapter=ViewPageAdapter(images)
        binding.viewPager.adapter=adapter


    }
}