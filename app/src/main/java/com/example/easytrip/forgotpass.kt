package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_forgotpass.*
import kotlinx.android.synthetic.main.activity_login.*

class forgotpass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpass)

        button1.setOnClickListener {
            if (edtextE.text.isEmpty()) {
                Toast.makeText(this, "Please enter your Email!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }

    }
}