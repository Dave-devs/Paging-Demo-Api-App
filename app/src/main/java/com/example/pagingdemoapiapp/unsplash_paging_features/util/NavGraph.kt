package com.example.pagingdemoapiapp.unsplash_paging_features.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.example.pagingdemoapiapp.unsplash_paging_features.presentation.home_screen.HomeScreen
import com.example.pagingdemoapiapp.unsplash_paging_features.presentation.search_screen.SearchScreen

@ExperimentalCoilApi
@ExperimentalPagingApi
@Composable
fun NavGraph(navController: NavController) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Search.route) {
            SearchScreen(navController = navController)
        }
    }
}