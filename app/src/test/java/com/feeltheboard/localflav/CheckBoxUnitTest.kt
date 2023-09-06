package com.feeltheboard.localflav

import com.feeltheboard.localflav.vm.DishViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CheckboxViewModelTest {
    private lateinit var viewModel: DishViewModel

    @Before
    fun setup() {
        viewModel = DishViewModel()
    }

    @Test
    fun testToggleCheckbox() {
        // Initial state should be false
        assertEquals(false, viewModel.cardCheckBoxIsChecked.value)

        viewModel.toggleCheckbox()
        // After toggling, the state should be true
        assertEquals(true, viewModel.cardCheckBoxIsChecked.value)

        viewModel.toggleCheckbox()
        // After toggling again, the state should be false
        assertEquals(false, viewModel.cardCheckBoxIsChecked.value)
    }
}