package com.feeltheboard.localflav.components

import androidx.annotation.StringRes
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
fun DishDescriptionCard(
    @StringRes description: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .padding(
                top = dimensionResource(R.dimen.padding_small),
                bottom = dimensionResource(R.dimen.padding_small),
                start = dimensionResource(R.dimen.padding_small),
                end = dimensionResource(R.dimen.padding_end_description),
            )
    ) {
        Text(
            text = stringResource(id = description),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Preview
@Composable
fun DishDescriptionPreview() {
    LocalFlavTheme {
        DishDescriptionCard(R.string.description_1)
    }
}
