package com.example.hiltexample.repo

import android.util.Log
import com.example.hiltexample.TAG
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: Saved user to DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: Saved user to Firebase")
    }
}