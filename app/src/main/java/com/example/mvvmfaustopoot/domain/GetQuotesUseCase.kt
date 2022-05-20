package com.example.mvvmfaustopoot.domain

import com.example.mvvmfaustopoot.data.model.QuoteModel
import com.example.mvvmfaustopoot.data.model.QuoteRepository

class GetQuotesUseCase {
    private val repository=QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>?= repository.getAllQuotes()

}