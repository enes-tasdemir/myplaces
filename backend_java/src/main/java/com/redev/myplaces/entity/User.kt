package com.redev.myplaces.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator

@Entity
data class User(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,
        val userName: String?,
        val displayName: String?,
        val email: String,
        val password: String,
) {
        constructor() : this(null,null,"","","")
}
