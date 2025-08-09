package com.antiglobalist.tripmeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform