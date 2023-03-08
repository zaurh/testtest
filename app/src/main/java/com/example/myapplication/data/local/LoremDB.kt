package com.example.myapplication.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LoremDB::class], version = 1)
abstract class LoremDB: RoomDatabase() {
    abstract fun loremDao(): LoremDao

}