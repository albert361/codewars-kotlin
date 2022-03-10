package org.awa.katas.kyu6

/**
 * https://www.codewars.com/kata/5839edaa6754d6fec10000a2/kotlin
 */
fun findMissingLetter(array: CharArray): Char {
    return array
        .reduce { prev, cur ->
            if (prev.inc() == cur) cur else return prev.inc()
        }
}

fun main() {
    println(findMissingLetter(charArrayOf('a', 'b', 'c', 'd', 'f')))
    println(findMissingLetter(charArrayOf('O', 'Q', 'R', 'S')))
}