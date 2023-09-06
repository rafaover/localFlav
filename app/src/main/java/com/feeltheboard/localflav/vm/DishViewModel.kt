package com.feeltheboard.localflav.vm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DishViewModel: ViewModel() {
    var cardCheckBoxIsChecked = mutableStateOf(false)

    fun toggleCheckbox() {
        cardCheckBoxIsChecked.value = !cardCheckBoxIsChecked.value
    }
}