package com.example.multimodule.app

import android.app.Application
import com.example.calculator.di.CalculatorComponent
import com.example.calculator.di.provider.CalculatorComponentProvider
import com.example.multimodule.di.ApplicationComponent
import com.example.multimodule.di.DaggerApplicationComponent
import com.example.multimodule.di.provider.ApplicationComponentProvider

class CustomApplication : Application(),
    CalculatorComponentProvider,
    ApplicationComponentProvider {

    private val _applicationComponent: ApplicationComponent by lazy(LazyThreadSafetyMode.NONE) {
        DaggerApplicationComponent.builder()
            .application(this@CustomApplication)
            .build()
    }

    override fun getCalculatorComponent(): CalculatorComponent {
        return getApplicationComponent()
            .calculatorComponent()
    }

    override fun getApplicationComponent(): ApplicationComponent {
        return _applicationComponent
    }
}