package com.example.myapplication.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LoremEntity(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int,
    @PrimaryKey val roomId: Int? = null
)