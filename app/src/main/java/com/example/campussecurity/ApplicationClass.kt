package com.example.campussecurity

import android.app.Application
import com.example.campussecurity.database.AppDatabase

class ApplicationClass:Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}