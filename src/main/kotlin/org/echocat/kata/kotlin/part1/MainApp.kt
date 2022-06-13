package org.echocat.kata.kotlin.part1

class MainApp {

    fun getHelloWorldText(): String {
        return "Hello world!"
    }

}


fun main() {
    println(MainApp().getHelloWorldText())
}
