package com.veasta.noteapp.repository

import android.util.Log
import  com.veasta.noteapp.utils.Constants.TAG
import com.veasta.noteapp.api.UserAPI
import com.veasta.noteapp.models.UserRequest
import javax.inject.Inject

class UserRepository @Inject constructor(private val userAPI: UserAPI) {
    suspend fun registerUser(userRequest: UserRequest) {
        val response = userAPI.signup(userRequest)
        Log.d(TAG, response.body().toString())
    }

    suspend fun loginUser(userRequest: UserRequest) {
        val response = userAPI.signin(userRequest)
        Log.d(TAG, response.body().toString())
    }
}
