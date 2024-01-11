package com.example.bottomtraycheckout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomrisentray.BaseActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.bottomrisentray.R.layout.bottom_sheet_fragment)
        BaseActivity.checking()
    }
}