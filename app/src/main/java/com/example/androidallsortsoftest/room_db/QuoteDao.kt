package com.example.androidallsortsoftest.room_db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface QuoteDao {

    @Insert
    suspend fun insertQuote(quoteData: quote_data)

    @Update
    suspend fun updatePost(quoteData: quote_data)

    @Query("DELETE FROM quote_data")
    suspend fun delete()

    @Query("SELECT * FROM quote_data")
    suspend fun getQuote():LiveData<List<quote_data>>

    @Query("SELECT * FROM quote_data where id= :quoteId")
    suspend fun getQuoteById(quoteId:Int):quote_data


}