class Human {
    val greeting: String
        get() {
            return "Hello Gradle 2023-05-19!"
        }
}

fun main() {
    print(Human().greeting)
}