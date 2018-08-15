package com.zendesk

class ComplexClass(val description : String) : GenericInterface<TestClass> {
    override fun getListString(): List<String> = listOf("String_1", "String_2", "String_3")

    override fun getMutableListString(): MutableList<String> = mutableListOf("String_1", "String_2", "String_3")

    val testClass = TestClass("Test classes definitely have names")

    override fun getString(): String = "This is the string from ComplexClass"

    override fun getBool(): Boolean =  true

    override fun getComplexObject(): ComplexClass = this

    override fun getGeneric(): TestClass = testClass

    override fun getLong(): Long = 17L

}