package com.example.finzper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_new_ingresos.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        val btnRegresar = findViewById<ImageButton>(R.id.btn_regresar)
        btnRegresar.setOnClickListener{
            showRegresar()
        }
        val btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener{
            showLogin()
        }
    }

    private fun showRegresar(){
        val loginIntent : Intent = Intent(this, BienvenidaActivity::class.java)
        startActivity(loginIntent)
    }
    private fun showLogin(){
        val inicioIntent : Intent = Intent(this,MainActivity::class.java)
        startActivity(inicioIntent)
    }
}