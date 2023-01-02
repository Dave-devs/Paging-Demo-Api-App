package com.example.pagingdemoapiapp.unsplash_paging_features.domain.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.pagingdemoapiapp.unsplash_paging_features.data.UnsplashDatabase
import com.example.pagingdemoapiapp.unsplash_paging_features.data.api.UnsplashApi
import com.example.pagingdemoapiapp.unsplash_paging_features.data.remote.UnsplashImage
import com.example.pagingdemoapiapp.unsplash_paging_features.domain.paging.SearchSource
import com.example.pagingdemoapiapp.unsplash_paging_features.domain.paging.UnsplashRemoteMediator
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UnsplashRepository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {
    @OptIn(ExperimentalPagingApi::class)
    fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = {unsplashDatabase.unsplashImageDao().getAllImages()}
        return Pager(
            config = PagingConfig(pageSize = 10),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi = unsplashApi,
                unsplashDatabase = unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    fun searchImages(query: String):Flow<PagingData<UnsplashImage>>{
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                SearchSource(unsplashApi = unsplashApi, query = query)
            }
        ).flow
    }
}