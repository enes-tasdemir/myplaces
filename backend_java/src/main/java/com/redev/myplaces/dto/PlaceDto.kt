package com.redev.myplaces.dto

import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator

data class PlaceDto(
        val id: String,
        val name: String,
        val xCoordinate: Double,
        val yCoordinate: Double,
)
