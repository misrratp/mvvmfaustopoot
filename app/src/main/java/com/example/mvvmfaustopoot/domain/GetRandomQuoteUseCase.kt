package com.example.mvvmfaustopoot.domain

import com.example.mvvmfaustopoot.data.model.QuoteModel
import com.example.mvvmfaustopoot.data.model.QuoteProvider
import com.example.mvvmfaustopoot.data.model.QuoteRepository

class GetRandomQuoteUseCase {
    private val repository=QuoteRepository()
    operator fun invoke(): QuoteModel?{
        val quotes=QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber:Int=(quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}