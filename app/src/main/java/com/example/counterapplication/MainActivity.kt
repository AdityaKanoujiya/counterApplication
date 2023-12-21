package com.example.counterapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private lateinit var btnincrement: Button
private lateinit var btndecrement: Button
private lateinit var txtcounter: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter= 0
        btnincrement = findViewById(R.id.btnincrement)
        btndecrement = findViewById(R.id.btndecrement)
        txtcounter = findViewById(R.id.txtcounter)
        btnincrement.setOnClickListener(){
            counter+=1
            txtcounter.setText(counter.toString())
        }
        btndecrement.setOnClickListener(){
            if(counter>0) {
                counter -= 1
                txtcounter.setText(counter.toString())
            }
        }
    }
}