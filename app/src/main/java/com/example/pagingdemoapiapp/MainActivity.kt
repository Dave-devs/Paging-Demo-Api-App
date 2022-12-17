package com.example.pagingdemoapiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.example.pagingdemoapiapp.ui.theme.PagingDemoApiAppTheme
import com.example.pagingdemoapiapp.unsplash_paging_features.util.NavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagingApi::class, ExperimentalCoilApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PagingDemoApiAppTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}