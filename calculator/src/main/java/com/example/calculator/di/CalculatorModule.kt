package com.example.calculator.di

import com.example.calculator.usecase.SumUseCase
import com.example.core.resource.StringsProvider
import dagger.Module
import dagger.Provides

@Module
class CalculatorModule {

    @Provides
    @CalculatorScope
    fun sumUseCase(
        stringsProvider: StringsProvider
    ): SumUseCase = SumUseCase(stringsProvider)

}
