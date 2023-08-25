package com.feeltheboard.localflav.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.feeltheboard.localflav.R
import com.feeltheboard.localflav.model.Dish
import com.feeltheboard.localflav.ui.theme.LocalFlavTheme

@Composable
fun DishCard(
    dish: Dish,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            shape = CardDefaults.shape,
            border = BorderStroke(
                dimensionResource(R.dimen.card_border),
                MaterialTheme.colorScheme.primary
            )
        ) {
            Row(
                verticalAlignment = Alignment.Bottom
            ) {
                val checkedState = remember { mutableStateOf(false) }
                DishDayTitleCard(
                    day = dish.dayRes,
                    title = dish.titleRes
                )
                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it },
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