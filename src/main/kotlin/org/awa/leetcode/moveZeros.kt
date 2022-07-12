package org.awa.leetcode

import org.awa.print

fun main() {
    val input1 = intArrayOf(0,1,0,3,12)
    moveZeroes(input1)
    val input2 = intArrayOf(0)
    moveZeroes(input2)
    val input3 = intArrayOf(0,1,0)
    moveZeroes(input3)
    input1.print()
    input2.print()
    input3.print()
}

fun moveZeroes(nums: IntArray): Unit {
    var pivotIndex = 1
    for (i in nums.indices) {
        if (nums[i] == 0 ) {
            if (pivotIndex < i) {
                pivotIndex = i + 1
            }
            while (true) {
                if (pivotIndex >= nums.size) {
                    break
                }
                if (nums[pivotIndex] != 0) {
                    nums[i] = nums[pivotIndex]
                    nums[pivotIndex] = 0
                    break
                }
                pivotIndex++
            }
        }
    }
    return
}
