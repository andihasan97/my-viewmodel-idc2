package com.andihasan7.myviewmodel2

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var result = 0

    fun calculate(width: String, height: String, length: String) {
        result = width.toInt() * height.toInt() * length.toInt()
    }
}