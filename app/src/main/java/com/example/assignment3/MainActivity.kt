package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.ActivityNotFoundException
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val button:Button = findViewById((R.id.button))
    private val name:EditText = findViewById(R.id.editTextTextPersonName)
    private val year:EditText = findViewById(R.id.editTextNumber)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener()
        {
            intent = Intent(this,Reciever::class.java)
            intent.putExtra("name_value",name)
            intent.putExtra("year_value",year)
            startActivity(intent)
        }
    }

}