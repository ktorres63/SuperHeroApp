package com.tutorial.superheroapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superheroes: List<SuperHeroesItemResponse>
)

data class SuperHeroesItemResponse(
    @SerializedName("id") val superheroId: String,
    @SerializedName("name") val name:String,
    @SerializedName("image") val superHeroImage:SuperheroImageResponse
)

data class SuperheroImageResponse(@SerializedName("url") val url:String)