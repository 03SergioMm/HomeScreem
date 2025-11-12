package com.ecommerce.activityimages.navigation

sealed class Screen (val route: String) {
    object Home : Screen("home")

    object Details : Screen("details/{teamId}"){
        fun createRoute(teamId: String) = "details/$teamId"
        const val arg = "teamId"
    }
    object Settings : Screen("settings")
}