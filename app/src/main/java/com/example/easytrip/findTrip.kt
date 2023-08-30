package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_find_trip.*
import kotlinx.android.synthetic.main.activity_login.*

class findTrip : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_trip)

        textView26.setOnClickListener {

                Toast.makeText(this, "You can't select this, it's full!!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

        }
        textView27.setOnClickListener {

            val parameterIntent = Intent(this, seatselect::class.java)
            startActivity(parameterIntent)

        }

    }
}