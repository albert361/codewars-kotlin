package org.awa.leetcode

fun main() {
    val testArray = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println(removeDuplicates(testArray))
    println(testArray.joinToString(","))
}

fun removeDuplicates(nums: IntArray): Int {
    var currentIndex = 0
    var currentValue: Int? = null
    nums.forEachIndexed { _, num ->
        if (num != currentValue) {
            nums[currentIndex] = num
            currentValue = num
            currentIndex++
        }
    }
    return currentIndex
}
