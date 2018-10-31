package jp.bizen.kotlinapp

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Hello! Kotlin/Native on ${platformName()}."
}