package com.example.pagingdemoapiapp.unsplash_paging_features.presentation.home_screen

import androidx.lifecycle.ViewModel
import androidx.paging.ExperimentalPagingApi
import com.example.pagingdemoapiapp.unsplash_paging_features.domain.repository.UnsplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@ExperimentalPagingApi
@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: UnsplashRepository
): ViewModel() {
    val getAllImages = repository.getAllImages()
}