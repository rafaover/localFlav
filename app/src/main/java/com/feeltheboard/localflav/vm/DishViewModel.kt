package com.feeltheboard.localflav.vm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DishViewModel: ViewModel() {
    var cardCheckBoxIsChecked = mutableStateOf(false)

    private var _showDialog = mutableStateOf(false)
    val showDialog = _showDialog

    /** Changes value of info Dialog on TopBar */
    fun changeShowDialogValue() {
        _showDialog.value = !_showDialog.value
    }


    /** Changes value for CheckBox on card - Used in Unit Testing */
    fun toggleCheckbox() {
        cardCheckBoxIsChecked.value = !cardCheckBoxIsChecked.value
    }
}