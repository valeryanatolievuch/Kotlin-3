package ru.otus.homework
fun sumOfNumbers(first: Int, second: Int, vararg others: Int): Int {
    return first + second + others.sum()
}
fun main() {
    println(sumOfNumbers(1,2,3,4,5))
}