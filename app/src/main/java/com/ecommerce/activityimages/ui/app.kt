package com.ecommerce.activityimages.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController


@Composable
fun App (){
    val nav = rememberNavController()

    AppNavGraph(navController = nav)
}