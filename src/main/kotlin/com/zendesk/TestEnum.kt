package com.zendesk

enum class TestEnum(val number: Int, val valueString: String) {

    ENUM_1(1, "One"),
    ENUM_2(2, "Two"),
    ENUM_3(3, "Three"),
    ENUM_4(4, "Four"),
    ENUM_5(5, "Five");

    companion object {
        fun allValues() : Array<TestEnum> = arrayOf(TestEnum.ENUM_1, TestEnum.ENUM_2, TestEnum.ENUM_3, TestEnum.ENUM_4, TestEnum.ENUM_5)
    }
}
