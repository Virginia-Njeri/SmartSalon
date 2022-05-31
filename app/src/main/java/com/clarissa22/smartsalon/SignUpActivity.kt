package com.clarissa22.smartsalon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    lateinit var btnSignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btnSignup=findViewById(R.id.btnSignup)
        btnSignup.setOnClickListener {
            val intent=Intent(this,AppointmentActivity::class.java)
            startActivity(intent)
        }
    }
}