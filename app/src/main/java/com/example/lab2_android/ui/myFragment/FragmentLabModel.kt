package com.example.lab2_android.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentLabModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "lab fragment"
    }
    val text: LiveData<String> = _text
}