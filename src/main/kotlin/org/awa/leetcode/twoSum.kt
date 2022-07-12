package org.awa.leetcode

import org.awa.print

fun main() {
    TwoSum().twoSum(intArrayOf(2,7,11,15), 9).print()
    TwoSum().twoSum(intArrayOf(3,2,4), 6).print()
    TwoSum().twoSum(intArrayOf(3,3), 6).print()
}

class TwoSum {
    private val map = mutableMapOf<Int, Int>()
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            val value = nums[i]
            if (value in map) {
                if (value + value == target) {
                    return intArrayOf(map[value]!!, i)
                }
            } else {
                map[value] = i
            }
            val remain = target - value
            if (remain in map && map[remain]!! != i) {
                return intArrayOf(map[remain]!!, i)
            }
        }
        return intArrayOf()
    }
}
