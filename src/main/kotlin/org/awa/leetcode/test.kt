package org.awa.leetcode

class test {
    fun heightChecker(heights: IntArray): Int {
        val correctArray = intArrayOf(*heights).sortedArray()
        var count = 0
        for (i in correctArray.indices) {
            if (correctArray[i] != heights[i]) {
                count++
            }
        }
        return count
    }
}