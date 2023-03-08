package com.example.myapplication.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.domain.model.LoremEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LoremDao {
    @Insert
    suspend fun Insert(loremEntity: LoremEntity)

    @Delete
    suspend fun Delete(loremEntity: LoremEntity)

    @Query("SELECT * FROM lorementity")
    suspend fun butunLorem(): Flow<List<LoremEntity>>
}