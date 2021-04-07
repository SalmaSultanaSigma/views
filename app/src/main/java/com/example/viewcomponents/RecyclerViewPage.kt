package com.example.viewcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewcomponents.databinding.ActivityMainBinding
import com.example.viewcomponents.databinding.ActivityRecyclerViewPageBinding

class RecyclerViewPage : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewPageBinding
    private var layoutManager: RecyclerView.LayoutManager?= null
    private  var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Recycler View"
        actionBar.setDisplayHomeAsUpEnabled(true)
        //recyclerView

        layoutManager= LinearLayoutManager(this)
        binding.recyclerViewId.layoutManager=layoutManager
        adapter=RecyclerAdapter()
        binding.recyclerViewId.adapter=adapter

    }
}