package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface QuoteDao {

    @Query("SELECT * FROM quote")
    fun getQuotes(): LiveData<List<Quote>>

    @Insert
    suspend fun insertQuote(quote: Quote)

    @Delete
    suspend fun deleteQuote(quote: Quote)

    @Update
    suspend fun updateQuote(quote: Quote)

}