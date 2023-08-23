package com.feeltheboard.localflav.components

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.R

@Composable
fun DishImageCard(
    @DrawableRes image: Int,
    @StringRes caption: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(dimensionResource(R.dimen.padding_small))
    ) {
        Image(
            painter = painterResource(id = image), 
            contentDescription = stringResource(id = caption),
            modifier = Modifier
                .size(dimensionResource(R.dimen.image_size))
                .clip(MaterialTheme.shapes.small),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun DishImageCardPreview() {
    DishImageCard(
        image = R.drawable.image_15,
        caption = R.string.title_15
    )
}