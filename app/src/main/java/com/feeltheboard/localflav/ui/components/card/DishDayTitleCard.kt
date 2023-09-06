package com.feeltheboard.localflav.ui.components.card

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.R
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme

@Composable
fun DishDayTitleCard(
    @StringRes day: Int,
    @StringRes title: Int,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Column(modifier.padding(dimensionResource(id = R.dimen.padding_small))) {
            Text(
                text = stringResource(id = day),
                style = MaterialTheme.typography.labelSmall
            )
            Text(
                text = stringResource(id = title),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview
@Composable
fun DayTitlePreview() {
    LocalFlavTheme {
        DishDayTitleCard(
            day = R.string.day_1,
            title = R.string.title_1
        )
    }
}