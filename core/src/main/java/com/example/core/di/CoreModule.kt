package com.example.core.di

import android.app.Application
import android.util.Log
import com.example.core.resource.StringsProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {

    init {
        Log.v("DAGGER", "created CoreModule")
    }

    @Provides
    @Singleton
    fun stringsProvider(application: Application) = StringsProvider(application)
}