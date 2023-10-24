package com.example.eldarapp.data.remote

import com.example.eldarapp.data.model.weather.WeatherForecastEntity
import com.example.eldarapp.repository.weather.WebService

class WeatherDataSource(private val webService: WebService) {
    suspend fun getWeatherForecastByCoordinates(
        lat: Double,
        lon: Double,
        exclude: String,
        units: String,
        lang: String
    ): WeatherForecastEntity {
        return webService.getWeatherForecastByCoordinates(lat,lon,exclude,units,lang,lang)
    }
}