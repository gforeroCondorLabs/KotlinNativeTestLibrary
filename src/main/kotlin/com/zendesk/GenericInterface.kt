package com.zendesk

interface GenericInterface<T> {

    fun getLong() : Long

    fun getString() : String

    fun getBool() : Boolean

    fun getComplexObject() : ComplexClass

    fun getGeneric() : T

}