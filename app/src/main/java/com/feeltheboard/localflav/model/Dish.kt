package com.feeltheboard.localflav.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dish(
    @StringRes val dayRes: Int,
    @StringRes val titleRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int
)