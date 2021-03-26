package com.example.android_hilt_tutorial

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


// @InstallIn allows the binding of scope to dependencies;
// this makes dependency exists as long as the application is alive
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton // makes function a singleton
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a string injected from AppModule"

}