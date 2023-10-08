package com.example.aplikasiku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_letsgo : Button = findViewById(R.id.button_implisit)
        button_letsgo.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button_implisit -> {
                val message = "WELCOME TO OUR STORE"
                val pesan = Intent()
                pesan.action = Intent.ACTION_SEND
                pesan.putExtra(Intent.EXTRA_TEXT, message)
                pesan.type = "text/plain"
                startActivity(pesan)
            }
        }
    }


}