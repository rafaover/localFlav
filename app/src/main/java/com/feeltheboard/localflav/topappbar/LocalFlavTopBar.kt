package com.feeltheboard.localflav.topappbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.R
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocalFlavTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = modifier.
                        padding(dimensionResource(R.dimen.padding_small)),
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = stringResource(R.string.app_name),
                )
            }
        },
        navigationIcon = {
            IconButton(
                content = { Icon(painter = painterResource(R.drawable.menu_access), contentDescription = "List of Dishes") },
                onClick = { /*TODO*/ },
                enabled = false,
            )
        }
    )
}

@Preview
@Composable
fun LocalFlavTopBarPreview() {
    LocalFlavTheme {
        LocalFlavTopAppBar()
    }
}