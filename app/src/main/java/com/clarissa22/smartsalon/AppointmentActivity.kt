package com.clarissa22.smartsalon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AppointmentActivity : AppCompatActivity() {
    lateinit var imgBraids:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment)
        imgBraids=findViewById(R.id.imgBraids)
        imgBraids.setOnClickListener {
            val intent=Intent(this,BraidsActivity::class.java)
            startActivity(intent)
        }
    }
}