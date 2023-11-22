package com.example.newsapp.presentation.onBoarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.newsapp.presentation.onBoarding.components.OnBoardingPages
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingScreen(){
   Column(modifier = Modifier.fillMaxSize()) {
       val pagerState = rememberPagerState(
           initialPage = 0,
       )

       var buttonState = remember {
           derivedStateOf {
               when(pagerState.currentPage){
                   0 -> listOf("","Next")
                   1 -> listOf("Back","Next")
                   2 -> listOf("Back","Get Started")
                   else -> listOf("","")
               }
           }
       }

       HorizontalPager(count = pages.size, state = pagerState) { index ->
           OnBoardingPages(page = pages[index])
       }
   }
}