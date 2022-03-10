package org.awa.katas.kyu6

/**
 * https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/kotlin
 */
val map = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000,
)

fun decode(str: String): Int {
    val parts = mutableListOf<List<Int>>()
    var values = mutableListOf<Int>()
    for (char in str) {
        val decodedValue = map[char]!!
        if (values.isNotEmpty()) {
            val lastValue = values.last()
            if (lastValue < decodedValue) {
                values.addAll(listOf(-values.removeLast(), decodedValue))
            } else {
                parts.add(values)
                values = mutableListOf(decodedValue)
            }
        } else {
            values.add(decodedValue)
        }
    }
    parts.add(values)
    return parts.sumOf { it.sum() }
}

fun main() {
    println(decode(""))
    println(decode("I"))
    println(decode("XXI"))
    println(decode("MCMXC"))
    println(decode("MMVIII"))
    println(decode("MDCLXVI"))
}