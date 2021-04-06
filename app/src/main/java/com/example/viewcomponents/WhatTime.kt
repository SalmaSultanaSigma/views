package com.example.viewcomponents

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TimePicker
import com.example.viewcomponents.databinding.ActivityRadioButtonBinding
import com.example.viewcomponents.databinding.ActivityWhatTimeBinding
import java.util.*

class WhatTime : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {


    var day=0
    var month=0
    var year=0
    var minuete=0
    var hour=0

    var savedDay=0
    var savedMonth=0
    var savedYear=0
    var savedMinuete=0
    var savedHour=0


    private lateinit var binding: ActivityWhatTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWhatTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

         //intent start
        val actionBar = supportActionBar
        actionBar!!.title = "Radio Button Activity"
        actionBar.setDisplayHomeAsUpEnabled(true)
        //intent finish
        pickDate()
    }
    private fun pickDate(){

        binding.timeDatebtn.setOnClickListener {
            getDateTimeCalender()
            DatePickerDialog(this,this,year,month,day).show()

        }
    }

    private fun getDateTimeCalender(){
        val cal: Calendar= Calendar.getInstance()
        day=cal.get(Calendar.DAY_OF_MONTH)
        month= cal.get(Calendar.MONTH)
        year=cal.get(Calendar.YEAR)
        minuete=cal.get(Calendar.MINUTE)
        hour=cal.get(Calendar.HOUR)
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        savedDay=dayOfMonth
        savedMonth=month
        savedYear=year

        getDateTimeCalender()
        TimePickerDialog(this,this,hour,minuete,true).show()
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
       savedMinuete=minute
        savedHour=hourOfDay

        binding.showTimeDatetv.text="$savedDay/$savedMonth/$savedYear\n $savedHour:$savedMinuete"
    }
}