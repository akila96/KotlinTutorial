package com.example.kotlintute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

   //var btn :Button?=null
   // var year :EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this);

    }

    override fun onClick(v: View?) {
        if(v?.id==button.id){
            val currentYear=Calendar.getInstance().get(Calendar.YEAR)
            age_Tv.text="Age"+(currentYear-year_et.text.toString().toInt())
        }
    }
}

































