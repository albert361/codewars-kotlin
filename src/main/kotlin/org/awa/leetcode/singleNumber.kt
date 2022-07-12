package org.awa.leetcode

fun main() {
    println(singleNumber(intArrayOf(2,2,1)))
    println(singleNumber(intArrayOf(4,1,2,1,2)))
    println(singleNumber(intArrayOf(1)))
}

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (i in nums) {
        result = result xor i
    }
    return result
}
