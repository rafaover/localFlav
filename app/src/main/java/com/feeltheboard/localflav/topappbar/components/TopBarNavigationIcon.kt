package com.feeltheboard.localflav.topappbar.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.feeltheboard.localflav.R

@Composable
fun TopBarNavigationIcon() {
    IconButton(
        content = {
            Icon(
                painter = painterResource(R.drawable.menu_access),
                contentDescription = "List of Countries"
            ) },
        onClick = { TODO("A Menu to show other countries dishes") },
    )
}