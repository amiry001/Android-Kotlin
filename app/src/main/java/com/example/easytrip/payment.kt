package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_payment.*
import kotlinx.android.synthetic.main.activity_ticket.*

class payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        button5.setOnClickListener {

            val parameterIntent = Intent(this, submit::class.java)
            startActivity(parameterIntent)

        }
    }


}