package ru.otus.homework

fun sumOfNumbers(first: Int, second: Int, vararg others: Int): Int {
    return first + second + others.sum()
}

fun joinStrings(vararg strings: String, separator: Char = ' '): String {
    return strings.joinToString(separator.toString())
}

fun testJoinStrings() {
    val result1 = joinStrings("str1", "str2", "str3")
    val result2 = joinStrings("str1", "str2", "str3", separator = ',')

    if (result1 == "str1 str2 str3") {
        println("Тест 1 пройден")
    } else {
        println("Тест 1 провален")
    }

    if (result2 == "str1,str2,str3") {
        println("Тест 2 пройден")
    } else {
        println("Тест 2 провален")
    }
}

fun measureTime(action: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    action()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}
fun longRunningTask() {
    for (i in 1..1000000) {

        print("")
    }
}

fun main() {
    println(sumOfNumbers(1, 2, 3, 4, 5))

    println(joinStrings("str1", "str2", "str3"))
    println(joinStrings("str1", "str2", "str3", separator = ','))

    testJoinStrings()

    val executionTime = measureTime {
        longRunningTask()
    }
    println("Время выполнения: $executionTime миллисекунд")
}
