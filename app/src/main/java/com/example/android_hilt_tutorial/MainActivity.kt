package com.example.android_hilt_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint // allows injection of dependencies
class MainActivity : AppCompatActivity() {

    @Inject // this injects the dependency
    @Named("String1")
    lateinit var testString: String

    private val viewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate: This is the testString: $testString")
        viewModel
    }
}