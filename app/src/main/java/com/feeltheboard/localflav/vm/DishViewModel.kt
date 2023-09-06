package com.feeltheboard.localflav.vm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DishViewModel: ViewModel() {
    val cardCheckBoxIsChecked = mutableStateOf(false)
}