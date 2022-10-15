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
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SummaryActivity: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        fillOutUserInfofield()
    }

    fun fillOutUserInfofield(){
        val intent = intent
        val phoneModel = intent.getStringExtra("phoneModel")
        val selectedColor = intent.getStringExtra("selectedColor")
        val storageCapacity = intent.getStringExtra("storageCapacity")
        val name = intent.getStringExtra("name")
        val address = intent.getStringExtra("address")
        val city = intent.getStringExtra("city")
        val postalCode = intent.getStringExtra("postalCode")
        val telephoneNumber = intent.getStringExtra("telephoneNumber")
        val cardNumber = intent.getStringExtra("cardNumber")
        val cardType = intent.getStringExtra("cardType")
        val expirationDate = intent.getStringExtra("expirationDate")
        val cvv = intent.getStringExtra("cvv")

        findViewById<TextView>(R.id.textView_PhoneModel).text = phoneModel
        findViewById<TextView>(R.id.textView_PhoneColor).text = selectedColor
        findViewById<TextView>(R.id.textView_StorageCapacity).text = storageCapacity
        findViewById<TextView>(R.id.textView_Name).text = name
        findViewById<TextView>(R.id.textView_Address).text = address
        findViewById<TextView>(R.id.textView_City).text = city
        findViewById<TextView>(R.id.textView_PostalCode).text = postalCode
        findViewById<TextView>(R.id.textView_TelNumber).text = telephoneNumber
        findViewById<TextView>(R.id.textView_CardNumber).text = cardNumber
        findViewById<TextView>(R.id.textView_CardType).text = cardType
        findViewById<TextView>(R.id.textView_ExpirationDate).text = expirationDate
        findViewById<TextView>(R.id.textView_CVV).text = cvv
    }
}