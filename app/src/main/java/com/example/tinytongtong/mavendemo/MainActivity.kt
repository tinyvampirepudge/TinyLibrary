package com.example.tinytongtong.mavendemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.LogUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtils.e("")
    }
}
