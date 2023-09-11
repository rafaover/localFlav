package com.feeltheboard.localflav.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.R
import com.feeltheboard.localflav.data.DataSource.dishes
import com.feeltheboard.localflav.ui.components.card.DishCard
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme
import com.feeltheboard.localflav.ui.topappbar.LocalFlavTopAppBar
import com.feeltheboard.localflav.vm.DishViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DishListingScreen(
    viewModel: DishViewModel = DishViewModel()
) {
    var showDialog by viewModel.showDialog

    Scaffold(
        topBar = {
            LocalFlavTopAppBar(viewModel = viewModel)
        },
        content = { it ->
            LazyColumn(
                contentPadding = it,
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))
            ) {
                items(dishes) {
                    DishCard(
                        dish = it,
                        viewModel = viewModel
                    )
                }
            }

            if (showDialog) {
                AlertDialog(
                    onDismissRequest = {
                        showDialog = false
                    },
                    icon = { Icon(Icons.Filled.Info, contentDescription = "localFlav") },
                    title = {
                        Text(text = "Title")
                    },
                    text = {
                        Text(
                            "This area typically contains the supportive text " +
                                    "which presents the details regarding the Dialog's purpose."
                        )
                    },
                    confirmButton = {
                        TextButton(
                            onClick = {
                                showDialog = false
                            }
                        ) {
                            Text("Thanks")
                        }
                    },
                )
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