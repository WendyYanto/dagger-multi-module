package com.example.core.resource

import android.app.Application
import android.util.Log
import androidx.annotation.StringRes

class StringsProvider(
    val application: Application
) {

    init {
        Log.v("DAGGER", "created StringsProvider")
    }

    fun getString(@StringRes id: Int): String = application.getString(id)

}