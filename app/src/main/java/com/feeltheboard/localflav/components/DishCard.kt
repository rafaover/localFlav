package com.feeltheboard.localflav.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.R
import com.feeltheboard.localflav.data.Dish
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme

@Composable
fun DishCard(
    dish: Dish,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.card_elevation)),
        shape = CardDefaults.shape
    ) {
        Row {
            DishDayTitleCard(
                day = dish.dayRes,
                title = dish.titleRes
            )
        }
        Row {
            Column {
                DishImageCard(
                    image = dish.imageRes,
                    caption = dish.titleRes
                )
            }
            Column {
                DishDescriptionCard(
                    description = dish.descriptionRes
                )
            }
        }
    }
}

@Preview
@Composable
fun DishCardPreview() {
    LocalFlavTheme {
        DishCard(
            dish = Dish(
                R.string.day_1,
                R.string.title_17,
                R.drawable.image_17,
                R.string.description_17
            )
        )
    }
}