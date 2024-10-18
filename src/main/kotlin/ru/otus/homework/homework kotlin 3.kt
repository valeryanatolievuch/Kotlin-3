package ru.otus.homework

fun sumOfNumbers(first: Int, second: Int, vararg others: Int): Int {
    return first + second + others.sum()
}

fun joinStrings(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator.toString())
}

fun main() {
    println(sumOfNumbers(1, 2, 3, 4, 5))

    println(joinStrings("str1", "str2", "str3"))
    println(joinStrings("str1", "str2", "str3", separator = ','))
}
