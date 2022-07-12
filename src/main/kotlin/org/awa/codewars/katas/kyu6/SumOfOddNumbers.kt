package org.awa.codewars.katas.kyu6

/**
 * https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/kotlin
 */
fun rowSumOddNumbers(n: Int): Int {
    val lead = (n * (n - 1)) + 1
    val end = lead + (n - 1) * 2
    return (lead + end) * n / 2
}

fun main() {
    println(rowSumOddNumbers(1))
    println(rowSumOddNumbers(2))
    println(rowSumOddNumbers(13))
    println(rowSumOddNumbers(19))
    println(rowSumOddNumbers(41))
    println(rowSumOddNumbers(42))
    println(rowSumOddNumbers(74))
    println(rowSumOddNumbers(86))
    println(rowSumOddNumbers(93))
    println(rowSumOddNumbers(101))
}
