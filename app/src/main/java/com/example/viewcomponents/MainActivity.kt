package com.example.viewcomponents

import android.app.SearchManager
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.Menu
import android.view.View
import android.widget.*
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewcomponents.databinding.ActivityMainBinding
import android.widget.SearchView as SearchView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnRadio.setOnClickListener {
            var intent = Intent(this, RadioButtonActivity::class.java)
            startActivity(intent)
        }

        binding.btnRatingSeek.setOnClickListener {
            var intent = Intent(this, RatingBarAndSeekBar::class.java)
            startActivity(intent)
        }
        binding.btnDateTime.setOnClickListener {
            var intent = Intent(this, WhatTime::class.java)
            startActivity(intent)
        }
        binding.btnRateMe.setOnClickListener {
            var dialog = CustomDialogFragment()
            dialog.show(supportFragmentManager, "customDialog")
        }

        binding.btnRecyclerView.setOnClickListener {
            var intent = Intent(this, RecyclerViewPage::class.java)
            startActivity(intent)
        }
        binding.btnViewPager2.setOnClickListener {
            var intent = Intent(this, ViewPager2::class.java)
            startActivity(intent)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchItem = menu?.findItem(R.id.search)
        val searchView = searchItem?.actionView as SearchView
        searchView.setSearchableInfo(manager.getSearchableInfo(componentName))
        searchView.setOnQueryTextFocusChangeListener(object: SearchView.OnQueryTextListener,
            View.OnFocusChangeListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                searchView.setQuery("",false)
                searchView.onActionViewCollapsed()
                Toast.makeText(this@MainActivity,"Looking for $query",Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

            override fun onFocusChange(v: View?, hasFocus: Boolean) {
                TODO("Not yet implemented")
            }

        })
        return true
    }

    override fun onBackPressed() {
        val builder= AlertDialog.Builder(this)
        builder.setTitle("Are you sure ?")
        builder.setMessage("Do you want to close the app ?")
        builder.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> }).show()
    }

}


