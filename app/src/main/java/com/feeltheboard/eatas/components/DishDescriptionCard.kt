package com.feeltheboard.eatas.components

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
import com.feeltheboard.eatas.R
import com.feeltheboard.eatas.ui.theme.EatasTheme

@Composable
fun DishDescriptionCard(
    @StringRes description: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_small))
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
    EatasTheme {
        DishDescriptionCard(R.string.description_1)
    }
}
