package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_menu_steps.*

class menuSteps : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_steps)



        bottomNavigationView = findViewById(R.id.bottom_nv)
        bottomNavigationView.setOnItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.act_home -> { showMsg("Home")
                    val parameterIntent = Intent(this, firstpage::class.java)
                    startActivity(parameterIntent)
                    true}
                R.id.act_explore -> { showMsg("Menu")
                    val parameterIntent = Intent(this, menuSteps::class.java)
                    startActivity(parameterIntent)
                    true}
                R.id.act_user -> { showMsg("PNR INFO")
                    val parameterIntent = Intent(this, Pnrinfo::class.java)
                    startActivity(parameterIntent)
                    true}
                else -> {false}
            }
        }
        buttonstep1.setOnClickListener{
            val parameterIntent = Intent(this, menu_details::class.java)
            startActivity(parameterIntent)
        }
        buttonstep2.setOnClickListener{
            val parameterIntent = Intent(this, tsale::class.java)
            startActivity(parameterIntent)
        }
        buttonstep3.setOnClickListener{
            val parameterIntent = Intent(this, TripRules::class.java)
            startActivity(parameterIntent)
        }
        buttonstep4.setOnClickListener{
            val parameterIntent = Intent(this, Contact::class.java)
            startActivity(parameterIntent)
        }



    }

    private fun showMsg(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()


    }

}