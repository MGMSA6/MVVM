package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes(): LiveData<List<Quote>> {
        return quoteRepository.getQuotes()
    }

    fun insertQuote(quote: Quote) {
        viewModelScope.launch(Dispatchers.IO) {
            quoteRepository.insertQuote(quote)
        }
    }

    fun deleteQuote(quote: Quote) {
        viewModelScope.launch(Dispatchers.IO) {
            quoteRepository.deleteQuote(quote)
        }
    }

    fun updateQuote(quote: Quote) {
        viewModelScope.launch(Dispatchers.IO) {
            quoteRepository.updateQuote(quote)
        }
    }
}