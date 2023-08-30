package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_menu_steps.*

class menuDetail : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout //Daha sonra deger kullanacak degıskenı tanımlandı
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var navView: NavigationView
    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonstep1.setOnClickListener{
            val parameterIntent = Intent(this, menu_details::class.java)
            startActivity(parameterIntent)
        }

        bottomNavigationView = findViewById(R.id.bottom_nv)
        bottomNavigationView.setOnItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.act_home -> { showMsg("Home")
                    val parameterIntent = Intent(this, firstpage::class.java)
                    startActivity(parameterIntent)
                    true}
                R.id.act_explore -> { showMsg("Explore")
                    val parameterIntent = Intent(this, menuSteps::class.java)
                    startActivity(parameterIntent)
                    true}
                R.id.act_user -> { showMsg("User")
                    val parameterIntent = Intent(this, Pnrinfo::class.java)
                    startActivity(parameterIntent)
                    true}
                else -> {false}
            }
        }

        drawerLayout = findViewById(R.id.drawerLayout)
        actionBarDrawerToggle = ActionBarDrawerToggle(this,drawerLayout,0,0)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        actionBarDrawerToggle.syncState()

        navView = findViewById(R.id.nView)
        navView.setNavigationItemSelectedListener {
                menuItem ->
            when (menuItem.itemId){
                R.id.myProfile -> { showMsg("My profile")
                    true}
                R.id.myBasket -> { showMsg("My Baslet")
                    true}
                else -> {false}
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        if (drawerLayout.isDrawerOpen(navView))
            drawerLayout.closeDrawer(navView)
        else
            drawerLayout.openDrawer(navView)
        return true
    }

    override fun onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            this.drawerLayout.closeDrawer(GravityCompat.START)
        }
        else
        {
            super.onBackPressed()
        }
    }

    private fun showMsg(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}