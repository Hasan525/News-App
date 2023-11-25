package com.example.newsapp.presentation.onBoarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsapp.R
import com.example.newsapp.presentation.Dimens.mediumPadding1
import com.example.newsapp.presentation.Dimens.mediumPadding2
import com.example.newsapp.presentation.onBoarding.Page
import com.example.newsapp.presentation.onBoarding.pages
import com.example.newsapp.ui.theme.NewsAppTheme

@Composable
fun OnBoardingPages(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.4f)
                .fillMaxWidth(0.4f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(mediumPadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = mediumPadding2),
            style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.home_page_title_color)
        )
        Spacer(modifier = Modifier.height(mediumPadding1))
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = mediumPadding2),
            style = MaterialTheme.typography.h6,
            color = colorResource(id = R.color.home_page_title_color)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    NewsAppTheme {
        OnBoardingPages(
            page = pages[0]
        )
    }
}