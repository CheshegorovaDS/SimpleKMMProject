package ru.novikova.simplekmmproject

import ru.novikova.simplekmmproject.useCase.GetLastSuccessLaunchUseCase
import ru.novikova.simplekmmproject.useCase.GetRocketsUseCase

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}! \n" +
                " There are only ${daysUntilNewYear()} days left until New Year! \uD83C\uDF86\""
    }

    @Throws(Exception::class)
    suspend fun greetingFromNetwork() : String {
        val getRocketsUseCase = GetRocketsUseCase()
        val getLastSuccessLaunchUseCase = GetLastSuccessLaunchUseCase(getRocketsUseCase)
        val rocketLaunch = getLastSuccessLaunchUseCase()
        return "The last successful launch was ${rocketLaunch.launchDateUTC} \uD83D\uDE80"
    }

}
