package com.example.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButToLogin= findViewById<Button>(R.id.button)
        val ButToSignup = findViewById<Button>(R.id.button2)

        ButToLogin.setOnClickListener{
            intent = Intent(this,login_activity::class.java)
            startActivity(intent)
        }

        ButToSignup.setOnClickListener{
            intent= Intent(this,signup_activity::class.java)
            startActivity(intent)
        }
    }
}