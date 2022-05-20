package com.example.mvvmfaustopoot.data.model

import com.example.mvvmfaustopoot.data.model.network.QuoteService

class QuoteRepository {
    private val api=QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response =api.getQuotes()
        QuoteProvider.quotes=response
        return response
    }
}