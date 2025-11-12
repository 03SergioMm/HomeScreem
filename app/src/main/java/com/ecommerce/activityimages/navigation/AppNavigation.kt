package com.ecommerce.activityimages.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.ecommerce.activityimages.ui.Screen.SettingsScreen


import com.ecommerce.activityimages.ui.screens.DetailsScreen
import com.ecommerce.activityimages.ui.screens.HomeScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {

        // Pantalla principal
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToDetails = { id -> navController.navigate(Screen.Details.createRoute(id)) },
                onNavigateToSettings = { navController.navigate(Screen.Settings.route) }
            )
        }

        // Detalle de un equipo
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(Screen.Details.arg) {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val teamId = backStackEntry.arguments?.getString(Screen.Details.arg) ?: ""
            DetailsScreen(
                teamId = teamId,
                onBack = { navController.popBackStack() }
            )
        }

        // Configuración
        composable(Screen.Settings.route) {
            SettingsScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}
