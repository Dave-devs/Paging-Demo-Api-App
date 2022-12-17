package com.example.pagingdemoapiapp.unsplash_paging_features.data.local

import kotlinx.serialization.SerialName

data class SearchImageResult(
    @SerialName("result") val images: List<UnsplashImage>
)
