package com.zendesk

class TestChildClass(name: String)  : TestClass(name) {

    val description = "This class extends another class"

    fun reverseName() = name.reversed()

}