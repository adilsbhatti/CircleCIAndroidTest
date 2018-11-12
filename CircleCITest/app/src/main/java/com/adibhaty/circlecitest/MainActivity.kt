package com.adibhaty.circlecitest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var bToast : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bToast = findViewById(R.id.bToast)


        bToast.setOnClickListener(View.OnClickListener() {

            Toast.makeText(applicationContext, "this si toast", 1).show()
        })


    }
}
