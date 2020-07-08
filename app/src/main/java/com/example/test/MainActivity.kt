package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {  //onCreate는 앱 최초실행됬을때 수행.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결한다.

        tv_title.setText("김배준") // xml 텍스트 id(tv_title)에 있는 내용 바꾸기 setText는 내용 넣는다
    }




}