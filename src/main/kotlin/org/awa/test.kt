package org.awa

fun main() {
    println(4 shr 1)
    println(2 shl 2)
    val arr = intArrayOf(1, 2)
    arr.reduce { a, b ->
        println("------")
        println(a)
        println(b)
        a
    }
}