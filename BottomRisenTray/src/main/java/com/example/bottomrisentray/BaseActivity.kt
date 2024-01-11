package com.example.bottomrisentray

import android.util.Log

public class BaseActivity {
    fun main(args: Array<String>) {
        checking()
    }

    open fun checking() {

    }

    companion object {
        fun checking() {
            Log.d("Called from library","Using testing Applications bottompass")
        }
    }

}