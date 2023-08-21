package com.feeltheboard.eatas.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.eatas.R

@Composable
fun DishImageCard(
    @DrawableRes image: Int,
    @StringRes description: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_small))
            .size(dimensionResource(id = R.dimen.image_size))
            .clip(MaterialTheme.shapes.small)
    ) {
        Image(
            painter = painterResource(id = image), 
            contentDescription = stringResource(id = description),
        )
    }
}