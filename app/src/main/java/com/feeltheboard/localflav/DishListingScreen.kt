package com.feeltheboard.localflav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.components.DishCard
import com.feeltheboard.localflav.topappbar.LocalFlavTopAppBar
import com.feeltheboard.localflav.data.DataSource.dishes
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DishListingScreen() {
    Scaffold(
        topBar = { LocalFlavTopAppBar() },
        content = {
            LazyColumn(
                contentPadding = it,
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
            ) {
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