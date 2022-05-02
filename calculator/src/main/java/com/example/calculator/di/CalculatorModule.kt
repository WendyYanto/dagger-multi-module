package com.example.calculator.di

import android.util.Log
import com.example.calculator.usecase.SumUseCase
import com.example.core.resource.StringsProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CalculatorModule {

    init {
        Log.v("DAGGER", "created CalculatorModule")
    }

    @Provides
    @CalculatorScope
    fun sumUseCase(
        stringsProvider: StringsProvider
    ): SumUseCase = SumUseCase(stringsProvider)

}
