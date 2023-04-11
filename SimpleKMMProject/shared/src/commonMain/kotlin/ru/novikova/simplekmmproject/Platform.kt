package ru.novikova.simplekmmproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform