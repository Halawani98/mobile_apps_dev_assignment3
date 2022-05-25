package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.content.ActivityNotFoundException
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import android.content.Context
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Notification.EXTRA_NOTIFICATION_ID


abstract class Reciever : AppCompatActivity() {
    val tvText:TextView = findViewById(R.id.textView7)
    val backbutton:Button = findViewById(R.id.button2)
    var notificationMsg:String = ""
    abstract val age:Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciever)
        val bundle:Bundle = intent.extras
        val name = bundle.get("name")
        val year = bundle.get("year")
        notificationMsg = "Hello $name!"

        backbutton.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        tvText.text = age.toString()
         fun basicNotification() {
            val builder = NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(notificationMsg)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            with(NotificationManagerCompat.from(this)) {
                notify(1, builder.build())
            }
        }


    }

}