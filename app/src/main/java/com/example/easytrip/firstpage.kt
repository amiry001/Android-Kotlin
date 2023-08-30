package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_firstpage.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu_steps.*

class firstpage : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        bt000.setOnClickListener {
            val parameterIntent = Intent(this, ticket::class.java)
            startActivity(parameterIntent)
        }
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





    }

    private fun showMsg(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}
