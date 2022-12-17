package com.example.pagingdemoapiapp.unsplash_paging_features.data.local

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity(tableName = "unsplash_entity_table")
@Serializable
data class UnsplashImage(
    val likes: Int,
    @Embedded val urls: Urls,
    @Embedded val user: User,
    @PrimaryKey(autoGenerate = false) val id: String,
)
