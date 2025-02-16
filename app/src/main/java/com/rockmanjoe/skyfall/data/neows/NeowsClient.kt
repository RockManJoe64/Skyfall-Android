package com.rockmanjoe.skyfall.data.neows

interface NeowsClient {
    fun getAsteroids()
    fun getAsteroidById()
    fun getAsteroidsByDate()
    fun getAsteroidsByDateRange()
    fun getAsteroidsByDateRangeAndSpeed()
    fun getAsteroidsByDateRangeAndDistance()
    fun getAsteroidsByDateRangeAndSize()
    fun getAsteroidsByDateRangeAndHazardous()
}