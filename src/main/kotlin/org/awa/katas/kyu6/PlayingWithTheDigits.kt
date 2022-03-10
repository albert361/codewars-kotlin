package org.awa.katas.kyu6

import kotlin.math.pow

/**
 * https://www.codewars.com/kata/5552101f47fc5178b1000050/kotlin
 */
fun String.splitIgnoreEmpty(vararg delimiters: String): List<String> {
    return this.split(*delimiters).filter {
        it.isNotEmpty()
    }
}

fun digPow(n: Int, p: Int): Int {
    var power = p
    val sum = n.toString().splitIgnoreEmpty("").sumOf {
        it.toDouble().pow((power++).toDouble()).toInt()
    }
    return if (sum.mod(n) == 0) sum / n else -1
}

fun main() {
    println(digPow(89, 1))
    println(digPow(92, 1))
    println(digPow(46288, 3))
}
