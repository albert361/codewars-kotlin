package org.awa.leetcode

import kotlin.math.sign

fun main() {
    println(plusOne(intArrayOf(1,2,3)).joinToString(","))
    println(plusOne(intArrayOf(4,3,2,1)).joinToString(","))
    println(plusOne(intArrayOf(9)).joinToString(","))
    println(plusOne(intArrayOf(9,8,7,6,5,4,3,2,1,0)).joinToString(","))
    println(plusOne(intArrayOf(7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6)).joinToString(","))
}

fun plusOne(digits: IntArray): IntArray {
    var overflow = 0
    for (index in digits.size - 1 downTo 0) {
        if (overflow == 1 || index == digits.size - 1) {
            if (digits[index] == 9) {
                digits[index] = 0
                overflow = 1
            } else {
                digits[index] += 1
                overflow = 0
            }
        }
    }
    if (overflow == 1) {
        return intArrayOf(1, *digits)
    }
    return digits
}
