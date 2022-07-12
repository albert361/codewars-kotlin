package org.awa

fun <T> Array<T>.print() {
    println(this.joinToString(","))
}

fun IntArray.print() {
    println(this.joinToString(","))
}
