package com.tia.toasty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tia.myapplication.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toasty.simpleToast(applicationContext,"Cam Scan")
    }
}