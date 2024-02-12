package com.redev.myplaces.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class User(
        @field:Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        val Id: Long,
        val userName: Long,
        val displayName: String,
        val email: String,
        val password: String,
)
