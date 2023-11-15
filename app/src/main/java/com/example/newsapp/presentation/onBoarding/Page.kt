package com.example.newsapp.presentation.onBoarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int
)


val pages = listOf<Page>(
    Page(
        title = "First page",
        description = "First view page",
        image = R.drawable.splash_animation
    ),
    Page(
        title = "Second page",
        description = "Second view page",
        image = R.drawable.splash_animation
    ),
    Page(
        title = "Third page",
        description = "Third view page",
        image = R.drawable.splash_animation
    )
)