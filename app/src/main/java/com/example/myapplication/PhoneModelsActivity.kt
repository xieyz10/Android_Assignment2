//
// App.js
//
//App Name: Assignment 2
//Author: Mingyuan Xie
//
//Created by MingyuanXie on 10/14/2022

//Revision History
//v1.0 created a basic app
//v1.1 implemented basic functionalities
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class PhoneModelsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonemodels)
        setupPhoneList()
        setupListItemClickEvent()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.phonebrands, menu)
        return true
    }

    fun setupPhoneList(){
        val intent = intent
        val phoneBrand = intent.getStringExtra("phoneBrand")
        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        var models = arrayOf("")
        if(phoneBrand == "iphone"){
            models = arrayOf("iPhone 14", "iPhone 14 Max", "iPhone 14 Pro")
        }else if(phoneBrand == "samsung"){
            models = arrayOf("Galaxy S22", "Galaxy S22 Ultra", "Galaxy Z")
        }else if(phoneBrand == "oppo"){
            models = arrayOf("Oppo Find X5", "Oppo Find X5 Pro", "Oppo Find X3")
        }else if(phoneBrand == "googlePixel"){
            models = arrayOf("Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel 6a")
        }
        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.phoneList)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, models)
        mListView.adapter = arrayAdapter
    }

    fun setupListItemClickEvent(){
        var mListView = findViewById<ListView>(R.id.phoneList)
        val intent = Intent(this@PhoneModelsActivity, PhoneStorageAndColorActivity::class.java)
        mListView.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            intent.putExtra("selectedPhoneType", selectedItem)
            startActivity(intent)
        })
    }
}