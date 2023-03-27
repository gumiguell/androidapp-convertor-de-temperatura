package com.example.temperatura

import  android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.temperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var txtCel : EditText
    lateinit var txtFah : EditText
    lateinit var btnCel : Button
    lateinit var btnFah : Button
    lateinit var tvCel : TextView
    lateinit var tvFah : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCel = findViewById(R.id.txtCel)
        txtFah = findViewById(R.id.txtFah)
        btnCel = findViewById(R.id.btnCel)
        btnFah = findViewById(R.id.btnFah)
        tvCel = findViewById(R.id.tvCel)
        tvFah = findViewById(R.id.tvFah)

30
        this.btnFah.setOnClickListener(){
            var cel:Double = txtCel.text.toString().toDouble()
            var fahrenheit = cel * 1.8 + 32
            tvFah.text = "${fahrenheit} ºF"
        }

        this.btnCel.setOnClickListener(){
            var fah:Double = txtFah.text.toString().toDouble()
            var celsius = (fah - 32) / 1.8
            tvCel.text = "${celsius} ºC"
        }
    }
}