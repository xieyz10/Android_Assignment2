package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.phonebrands, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var intent = Intent(this@MainActivity, PhoneModelsActivity::class.java)
        if(item.itemId == R.id.iPhone){
            intent.putExtra("phoneBrand","iphone")
        }else if(item.itemId == R.id.samsung){
            intent.putExtra("phoneBrand","samsung")
        }else if(item.itemId == R.id.oppo){
            intent.putExtra("phoneBrand","oppo")
        }
        else if(item.itemId == R.id.googlePixel){
            intent.putExtra("phoneBrand","googlePixel")
        }
        startActivity(intent)
        return true
    }
}