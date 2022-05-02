package com.example.calculator.di

import com.example.calculator.ui.CalculatorActivity
import dagger.Subcomponent


@CalculatorScope
@Subcomponent(
    modules = [
        CalculatorModule::class
    ]
)
interface CalculatorComponent {

    fun inject(calculatorActivity: CalculatorActivity)
}