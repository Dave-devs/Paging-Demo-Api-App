package com.example.pagingdemoapiapp.unsplash_paging_features.data.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pagingdemoapiapp.unsplash_paging_features.data.local.UnsplashImage

@Dao
interface UnsplashImageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertImages(images: List<UnsplashImage>)

    @Query("DELETE FROM unsplash_entity_table")
    suspend fun deleteAllImages()

    @Query("SELECT * FROM unsplash_entity_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>
}