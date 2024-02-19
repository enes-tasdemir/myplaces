package com.redev.myplaces.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator

@Entity
data class Place(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String,
        val name: String,
        val xCoordinate: Double,
        val yCoordinate: Double,
)
