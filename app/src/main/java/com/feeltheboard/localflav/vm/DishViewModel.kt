package com.feeltheboard.localflav.vm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DishViewModel: ViewModel() {
    private val _cardCheckBoxState = MutableStateFlow(false)
    val cardCheckBoxState: StateFlow<Boolean> = _cardCheckBoxState

    fun setCheckBoxState(isChecked: Boolean) {
        _cardCheckBoxState.value = isChecked
    }
}