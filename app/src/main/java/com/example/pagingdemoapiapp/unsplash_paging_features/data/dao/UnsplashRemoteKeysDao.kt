package com.example.pagingdemoapiapp.unsplash_paging_features.data.dao

import androidx.room.*
import com.example.pagingdemoapiapp.unsplash_paging_features.data.remote.UnsplashRemoteKeys

@Dao
interface UnsplashRemoteKeysDao {

   @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

   @Query("DELETE FROM unsplash_remote_keys_table")
   suspend fun deleteAllRemoteKeys()

   @Query("SELECT * FROM unsplash_remote_keys_table WHERE id = :id")
   suspend fun insertRemoteKeys(id: String): UnsplashRemoteKeys
}
