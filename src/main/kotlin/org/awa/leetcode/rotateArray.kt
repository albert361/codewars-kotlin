package org.awa.leetcode

fun main() {
    val array1 = intArrayOf(1,2,3,4,5,6,7)
    val array2 = intArrayOf(-1,-100,3,99)
    rotate(array1, 3)
    rotate(array2, 2)
    println(array1.joinToString(","))
    println(array2.joinToString(","))
}

fun rotate(nums: IntArray, k: Int): Unit {
    val rotateTimes = k % nums.size
    val rotatedPart = nums.takeLast(rotateTimes)
    for (index in nums.indices.reversed()) {
        nums[index] = rotatedPart.getOrElse(index) {
            nums[it - rotateTimes]
        }
    }
}