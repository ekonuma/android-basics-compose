package com.ekonuma.courses.model

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val title: Int,
    val coursesCount: Int,
    @DrawableRes val picture: Int
)