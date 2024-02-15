package com.redev.myplaces.dto

data class UserDto(
        val id: String,
        val userName: String,
        val displayName: String,
        val email: String,
        val token: String?,
)