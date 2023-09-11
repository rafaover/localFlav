package com.feeltheboard.localflav.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable

@Composable
fun TopBarNavigationIcon() {
    IconButton(
        content = {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "List of Countries"
            ) },
        onClick = { TODO("A Menu to show other countries dishes") },
        enabled = true
    )
}