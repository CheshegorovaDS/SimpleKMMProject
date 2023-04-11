package ru.novikova.simplekmmproject

import ru.novikova.simplekmmproject.data.RocketLaunch

class GetLastSuccessLaunchUseCase(
    private val getRockets: GetRocketsUseCase
) {

    suspend operator fun invoke(): RocketLaunch = getRockets()
            .last { it.launchSuccess == true }

}
