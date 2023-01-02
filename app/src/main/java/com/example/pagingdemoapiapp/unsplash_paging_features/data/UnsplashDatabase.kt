package com.example.pagingdemoapiapp.unsplash_paging_features.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pagingdemoapiapp.unsplash_paging_features.data.dao.UnsplashImageDao
import com.example.pagingdemoapiapp.unsplash_paging_features.data.dao.UnsplashRemoteKeysDao
import com.example.pagingdemoapiapp.unsplash_paging_features.data.remote.UnsplashImage
import com.example.pagingdemoapiapp.unsplash_paging_features.data.remote.UnsplashRemoteKeys

@Database(
    entities = [UnsplashImage::class, UnsplashRemoteKeys::class],
    version = 1, exportSchema = false
)
abstract class UnsplashDatabase: RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao

    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}