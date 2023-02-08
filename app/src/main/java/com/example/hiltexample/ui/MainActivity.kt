package com.example.hiltexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltexample.R
import com.example.hiltexample.repo.UserRepository
import com.example.hiltexample.qualifier.SqlQualifier
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @SqlQualifier
    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRepository.saveUser("test@example.com", "11111")
    }

}