package com.feeltheboard.localflav.components

import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.localflav.data.Dish

@Composable
fun DishCard(
    dish: Dish,
    modifier: Modifier = Modifier
) {
    Card {
        DishDayTitleCard(day = dish.dayRes, title = dish.titleRes)
        DishImageCard(image = dish.imageRes, caption = dish.titleRes)
        DishDescriptionCard(description = dish.descriptionRes)
    }
}