package com.example.easytrip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.easytrip.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.txtsu.setOnClickListener {

            val parameterIntent = Intent(this, signUp::class.java)
            startActivity(parameterIntent)
        }
        txt5.setOnClickListener {

            val parameterIntent = Intent(this, forgotpass::class.java)
            startActivity(parameterIntent)

        }


       binding.bt4.setOnClickListener{
           val email = binding.edtext1.text.toString()
           val pass = binding.edtext2.text.toString()

           if (email.isNotEmpty() && pass.isNotEmpty()) {
                   firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                       if (it.isSuccessful) {
                           val intent = Intent(this, firstpage::class.java)
                           startActivity(intent)
                       } else {
                           Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                       }
                   }

           } else {
               Toast.makeText(this, "Empty Fields are not Allowed!", Toast.LENGTH_SHORT).show()
           }
       }


    }
}