package com.feeltheboard.localflav.ui.topappbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.R
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme
import com.feeltheboard.localflav.ui.topappbar.components.TopBarNavigationIcon
import com.feeltheboard.localflav.vm.DishViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocalFlavTopAppBar(
    modifier: Modifier = Modifier,
    showDialog: () -> Unit
) {
    CenterAlignedTopAppBar(
        modifier = modifier,

        /* Feature tag to activate the navigation icon */
        navigationIcon = {
            val activateNavigationIcon = true
            if (activateNavigationIcon) TopBarNavigationIcon()
        },
        /* end of Feature tag */

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
        actions = {
                  IconButton(
                      onClick = { showDialog() }
                  ) {
                      Icon(
                          imageVector = Icons.Filled.Info,
                          contentDescription = "About"
                      )
                  }
        },
    )
}

@Preview
@Composable
fun LocalFlavTopBarPreview() {
    var showDialog by remember { mutableStateOf(false) }
    LocalFlavTheme {
        LocalFlavTopAppBar(showDialog = { showDialog = true })
    }
}