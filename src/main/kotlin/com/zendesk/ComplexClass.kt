package com.zendesk

class ComplexClass(val description : String) : GenericInterface<TestClass> {

    val testClass = TestClass("Test classes definitely have names")

    override fun getString(): String = "This is the string from ComplexClass"

    override fun getBool(): Boolean =  true

    override fun getComplexObject(): ComplexClass = this

    override fun getGeneric(): TestClass = testClass

    override fun getLong(): Long = 17L

}