package com.example.pagingdemoapiapp.unsplash_paging_features.data.api

import com.example.pagingdemoapiapp.BuildConfig
import com.example.pagingdemoapiapp.unsplash_paging_features.data.local.SearchImageResult
import com.example.pagingdemoapiapp.unsplash_paging_features.data.local.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): List<UnsplashImage>


    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchAllImages(
        @Query("query") query: String,
        @Query("per_page") per_page: Int
    ): SearchImageResult
}