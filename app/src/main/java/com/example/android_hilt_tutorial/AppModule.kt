package com.example.android_hilt_tutorial

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module

// @InstallIn allows the scoping of dependencies;
// this makes dependency exists as long as the application is alive
@InstallIn(Application::class)
object AppModule {

    @Singleton // makes function a singleton
    @Provides
    fun provideTestString() = "This is a string we will inject."
    
}