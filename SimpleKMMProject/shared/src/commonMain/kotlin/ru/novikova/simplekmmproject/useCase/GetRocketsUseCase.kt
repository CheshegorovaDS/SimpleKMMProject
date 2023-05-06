package ru.novikova.simplekmmproject.useCase

import io.ktor.client.call.*
import io.ktor.client.request.*
import ru.novikova.simplekmmproject.data.RocketLaunch
import ru.novikova.simplekmmproject.network.NetworkClient

class GetRocketsUseCase {

    suspend operator fun invoke(): List<RocketLaunch> = NetworkClient.httpClient
        .get("https://api.spacexdata.com/v4/launches")
        .body()

}
