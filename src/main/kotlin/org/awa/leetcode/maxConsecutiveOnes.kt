package org.awa.leetcode

class maxConsecutiveOnes {
    private var maxCount = 0

    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        nums.forEach { num ->
            if (num == 0) {
                count = 0
                return@forEach
            }
            maxCount = Math.max(maxCount, ++count)
        }
        return maxCount
    }
}