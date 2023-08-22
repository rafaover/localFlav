package com.feeltheboard.localflav.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.components.DishCard
import com.feeltheboard.localflav.components.LocalFlavTopAppBar
import com.feeltheboard.localflav.data.DataSource.dishes
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DishListingScreen() {
    Scaffold(
        topBar = { LocalFlavTopAppBar() },
        content = {
            LazyColumn(contentPadding = it) {
                items(dishes) {
                    DishCard(
                        dish = it
                    )
                }
            }
        }
    )
}

@Preview
@Composable
fun DishListingScreenPreview() {
    LocalFlavTheme {
        DishListingScreen()
    }
}