package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_find_trip.*
import kotlinx.android.synthetic.main.activity_seatselect.*
import kotlinx.android.synthetic.main.activity_seatselect.button10
import kotlinx.android.synthetic.main.activity_seatselect.button11
import kotlinx.android.synthetic.main.activity_seatselect.button12
import kotlinx.android.synthetic.main.activity_seatselect.button14
import kotlinx.android.synthetic.main.activity_seatselect.button15
import kotlinx.android.synthetic.main.activity_seatselect.button16
import kotlinx.android.synthetic.main.activity_seatselect.button6
import kotlinx.android.synthetic.main.activity_seatselect.button7
import kotlinx.android.synthetic.main.activity_seatselect.button8

class seatselect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seatselect)


        button7.setOnClickListener {

            Toast.makeText(this, "Please select an empty seat!!", Toast.LENGTH_SHORT).show()
            return@setOnClickListener

        }
        button11.setOnClickListener {

            Toast.makeText(this, "Please select an empty seat!!", Toast.LENGTH_SHORT).show()
            return@setOnClickListener

        }
        button14.setOnClickListener {

            Toast.makeText(this, "Please select an empty seat!!", Toast.LENGTH_SHORT).show()
            return@setOnClickListener

        }
        button12.setOnClickListener {

            Toast.makeText(this, "Please select an empty seat!!", Toast.LENGTH_SHORT).show()
            return@setOnClickListener

        }
        button6.setOnClickListener {

            val parameterIntent = Intent(this,payment::class.java)
            startActivity(parameterIntent)
        }
        button15.setOnClickListener {


            val parameterIntent = Intent(this,payment::class.java)
            startActivity(parameterIntent)

        }
        button19.setOnClickListener {

            val parameterIntent = Intent(this,payment::class.java)
            startActivity(parameterIntent)

        }
        button10.setOnClickListener {

            val parameterIntent = Intent(this,payment::class.java)
            startActivity(parameterIntent)

        }

        button8.setOnClickListener {


            val parameterIntent = Intent(this,payment::class.java)
            startActivity(parameterIntent)

        }
        button16.setOnClickListener {


            val parameterIntent = Intent(this,payment::class.java)
            startActivity(parameterIntent)

        }


    }
}