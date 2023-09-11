package com.feeltheboard.localflav.vm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DishViewModel: ViewModel() {
    var cardCheckBoxIsChecked = mutableStateOf(false)

    private var _showDialog = mutableStateOf(false)
    val showDialog = _showDialog

    /** Changes value of MainAlertDialog component Boolean */
    fun changeShowDialogValue() {
        _showDialog.value = !_showDialog.value
    }


    /** Unit Testing - Changes boolean for CheckBox on card */
    fun toggleCheckbox() {
        cardCheckBoxIsChecked.value = !cardCheckBoxIsChecked.value
    }
}