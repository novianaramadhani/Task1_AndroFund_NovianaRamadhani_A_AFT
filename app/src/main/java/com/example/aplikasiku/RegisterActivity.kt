package com.example.aplikasiku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_register : Button = findViewById(R.id.btn_register)
        btn_register.setOnClickListener(this)
    }

    // berfungsi untuk button nya
    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_register -> {
                val pindah = Intent(this@RegisterActivity, LoginActivity :: class.java)
                startActivity(pindah)
            }
        }
    }
}