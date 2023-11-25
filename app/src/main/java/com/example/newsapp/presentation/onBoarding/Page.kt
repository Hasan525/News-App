package com.example.newsapp.presentation.onBoarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)


val pages = listOf(
    Page(
        title = "Breaking News",
        description = "In a recent development, scientists have made a groundbreaking discovery" +
                " that could revolutionize our understanding of the universe. Utilizing " +
                "advanced telescopes and data analysis techniques, researchers have detected " +
                "an elusive phenomenon known as dark matter particles.",
        image = R.drawable.home_page_3
    ),
    Page(
        title = "Breaking News",
        description = "The research team, led by renowned astrophysicist Dr." +
                " Emily Collins, observed subtle gravitational interactions between galaxies, " +
                "providing strong evidence for the existence of dark matter. This finding challenges " +
                "existing theories and opens up new avenues" +
                " for exploring the fundamental nature of our cosmos.",
        image = R.drawable.home_page_3
    ),
    Page(
        title = "Breaking News",
        description = "This discovery is a game-changer in the field of astrophysics," +
                "said Dr. Collins. It confirms the presence of dark matter and provides valuable " +
                "insights into its properties. We are now eager to delve" +
                " deeper into this realm and uncover more about the hidden fabric of the universe.",
        image = R.drawable.home_page_3
    )
)