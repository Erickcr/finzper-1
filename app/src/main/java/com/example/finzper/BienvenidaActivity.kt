package com.example.finzper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BienvenidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val btnSesion = findViewById<Button>(R.id.btniniciosesion)
        btnSesion.setOnClickListener{
                showLogin()
        }

        val btnRegistro = findViewById<Button>(R.id.btnregistrate)
        btnRegistro.setOnClickListener{
            showRegistro()
        }
    }


   private fun showLogin(){
        val loginIntent : Intent = Intent(this, LoginActivity::class.java)
        startActivity(loginIntent)
    }

    private fun showRegistro(){
        val registroIntent : Intent = Intent(this, RegistroActivity::class.java)
        startActivity(registroIntent)
    }

}