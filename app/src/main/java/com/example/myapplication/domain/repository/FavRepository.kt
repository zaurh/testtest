package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.Lorem
import com.example.myapplication.domain.model.LoremEntity
import kotlinx.coroutines.flow.Flow

interface FavRepository {

    fun getFavs(): Flow<List<Lorem>>
    suspend fun addFav(loremEntity: LoremEntity)
    suspend fun deleteFav(loremEntity: LoremEntity)

}