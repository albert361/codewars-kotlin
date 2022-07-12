package org.awa.leetcode

import kotlin.math.min

fun main() {
    println(intersect(intArrayOf(1,2,2,1), intArrayOf(2,2)).joinToString(","))
    println(intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)).joinToString(","))
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val map1 = nums1.groupBy { it }
    val map2 = nums2.groupBy { it }
    val result = mutableListOf<Int>()
    map1.forEach { (value, values) ->
        if (value in map2) {
            result.addAll(generateSequence { value }.take(min(values.size, map2[value]!!.size)))
        }
    }
    return result.toIntArray()
}
