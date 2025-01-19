package com.example.androidallsortsoftest.room_db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [quote_data::class], version = 1)
abstract class QuoteDatabase : RoomDatabase() {

  abstract  fun getDao():QuoteDao

}