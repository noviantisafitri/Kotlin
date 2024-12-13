package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val regex = "\\d+".toRegex()
    val match = regex.find(str)

    return if (match != null) {
        val number = match.value.toInt() * int
        str.replace(regex, number.toString())
    } else {
        str + int
    }
}
