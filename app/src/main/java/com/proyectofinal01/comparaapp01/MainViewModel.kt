package com.proyectofinal01.comparaapp01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val comparisonResult = MutableLiveData<String>()

    fun compareStrings(text1: String, text2: String) {
        this.comparisonResult.value = if (text1 == text2) "Las cadenas son iguales" else "Las cadenas son diferentes"
    }
}
