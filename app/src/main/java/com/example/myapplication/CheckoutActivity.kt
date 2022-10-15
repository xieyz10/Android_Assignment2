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
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

    }

    fun submit(view: View){
        if(view.id == R.id.btnPlaceOrder){
            val intent = intent
            val phoneModel = intent.getStringExtra("phoneModel")
            val selectedColor = intent.getStringExtra("selectedColor")
            val storageCapacity = intent.getStringExtra("storageCapacity")

            //get all of the EditText control values
            val name = findViewById<EditText>(R.id.editText_Name).text.toString()
            val address = findViewById<EditText>(R.id.editText_Address).text.toString()
            val city = findViewById<EditText>(R.id.editText_City).text.toString()
            val postalCode = findViewById<EditText>(R.id.editText_PostalCode).text.toString()
            val telephoneNumber = findViewById<EditText>(R.id.editText_TelNumber).text.toString()
            val cardNumber= findViewById<EditText>(R.id.editText_CardNumber).text.toString()
            val cardType = findViewById<EditText>(R.id.editText_CardType).text.toString()
            val expirationDate = findViewById<EditText>(R.id.editText_ExpirationDate).text.toString()
            val cvv= findViewById<EditText>(R.id.editText_CVV).text.toString()

            if(name=="" || address == "" || city == "" || postalCode == ""
                || telephoneNumber=="" || cardNumber=="" || cardType==""
                || expirationDate == "" || cvv == ""){
                Toast.makeText(this, "Please fill out all of the fields", Toast.LENGTH_LONG).show()
                return
            }

            //forward text info to summary page
            val intent2 = Intent(this@CheckoutActivity, SummaryActivity::class.java)
            intent2.putExtra("phoneModel",phoneModel)
            intent2.putExtra("selectedColor",selectedColor)
            intent2.putExtra("storageCapacity",storageCapacity)
            intent2.putExtra("name",name)
            intent2.putExtra("address",address)
            intent2.putExtra("city",city)
            intent2.putExtra("postalCode",postalCode)
            intent2.putExtra("telephoneNumber",telephoneNumber)
            intent2.putExtra("cardNumber",cardNumber)
            intent2.putExtra("cardType",cardType)
            intent2.putExtra("expirationDate",expirationDate)
            intent2.putExtra("cvv",cvv)

            startActivity(intent2)
        }
    }
}