package com.example.calculator.usecase

import android.util.Log
import com.example.calculator.R
import com.example.core.resource.StringsProvider

class SumUseCase(
    val stringsProvider: StringsProvider
) {

    init {
        Log.v("DAGGER", "created SumUseCase")
    }

    fun execute(firstNumber: Int, secondNumber: Int): Result {
        return if (firstNumber > 0 && secondNumber > 0) {
            Result.Success(firstNumber + secondNumber)
        } else {
            Result.Failure(stringsProvider.getString(R.string.both_numbers_must_be_positive))
        }
    }

    sealed class Result {
        class Success(val result: Int) : Result()
        class Failure(val message: String) : Result()
    }

}