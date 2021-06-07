package com.example.finzper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val btnRegresar = findViewById<ImageButton>(R.id.btn_regresar)
        btnRegresar.setOnClickListener{
            showRegresar()
        }

    }
    private fun showRegresar(){
        val inicioIntent : Intent = Intent(this,MainActivity::class.java)
        startActivity(inicioIntent)

    }
}