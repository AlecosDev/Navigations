package com.example.findpets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ImageView

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        supportActionBar!!.hide()

        val trocarTela = findViewById<ImageView>(R.id.editar)

        trocarTela.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }



}