package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test2.*

class Test2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
       // val btnlogin : Button = findViewById(R.id.btn_login)
        btn_login.setOnClickListener {
            btn_login.setText("태혁")
        }
    }
}