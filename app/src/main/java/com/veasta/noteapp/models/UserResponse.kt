package com.veasta.noteapp.models

data class UserResponse(
    val token: String,
    val user: User
)