package com.example.pagingdemoapiapp.unsplash_paging_features.data.local

import androidx.room.Embedded
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userName: String,
    @SerialName("links")
    @Embedded val userLinks: UserLinks
)
