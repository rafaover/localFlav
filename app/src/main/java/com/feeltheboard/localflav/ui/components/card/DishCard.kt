package com.feeltheboard.localflav.ui.components.card

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.feeltheboard.localflav.R
import com.feeltheboard.localflav.data.Dish
import com.feeltheboard.localflav.vm.DishViewModel

@Composable
fun DishCard(
    dish: Dish,
    viewModel: DishViewModel,
    modifier: Modifier = Modifier
) {
    var cardCheckBoxIsChecked by rememberSaveable {
        mutableStateOf(viewModel.cardCheckBoxIsChecked.value)
    }

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
                DishDayTitleCard(
                    day = dish.dayRes,
                    title = dish.titleRes
                )
                Checkbox(
                    checked = cardCheckBoxIsChecked,
                    onCheckedChange = { cardCheckBoxIsChecked = it }
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

/*
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
*/