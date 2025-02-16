package com.rockmanjoe.skyfall.data.neows

data class NEOWSResponse(
    val links: Links,
    val element_count: Int,
    val near_earth_objects: Map<String, List<NearEarthObject>>
)

data class Links(
    val next: String,
    val previous: String
)

data class NearEarthObject(
    val name: String,
    val id: String,
    val neo_reference_id: String,
    val close_approach_data: List<CloseApproachData>,
    // TODO other properties as needed
)

data class CloseApproachData(
    val close_approach_date: String,
    val close_approach_date_full: String,
    val epoch_date_close_approach: Long,
    val relative_velocity: RelativeVelocity,
    val miss_distance: MissDistance,
    // TODO other properties as needed
)

data class RelativeVelocity(
    val kilometers_per_second: Double,
    val miles_per_hour: Double
)

data class MissDistance(
    val astronomical_units: Double,
    val kilometers: Double,
    val miles: Double
)