package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PhoneStorageAndColorActivity: AppCompatActivity() {

    var storageCapacity: String? = "32GB $399"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonestorageandcolors)
    }

    fun checkOut(view:View){
        if(view.id == R.id.btnCheckout){
            val intent = intent
            val phoneModel = intent.getStringExtra("selectedPhoneType")
            //var mRadioButton = findViewById<RadioGroup>(R.id.phoneStorageGroup)
            val spinner = findViewById<Spinner>(R.id.color_spinner)
            val selectedColor = spinner.selectedItem.toString()
            val intent2 = Intent(this@PhoneStorageAndColorActivity, CheckoutActivity::class.java)
            intent2.putExtra("phoneModel",phoneModel)
            intent2.putExtra("selectedColor",selectedColor)
            intent2.putExtra("storageCapacity",storageCapacity)
            startActivity(intent2)
        }
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked
            // Check which radio button was clicked
            when (view.getId()) {
                R.id.capacity_32 ->
                    if (checked) {
                        storageCapacity = "32GB $399"
                    }
                R.id.capacity_64 ->
                    if (checked) {
                        storageCapacity = "64GB $499"
                    }
                R.id.capacity_128 ->
                    if (checked) {
                        storageCapacity = "128GB $599"
                    }
            }
        }
    }
}