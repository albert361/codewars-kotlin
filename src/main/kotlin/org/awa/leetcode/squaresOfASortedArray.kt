package org.awa.leetcode

class SquaresOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        val indexBecomePositive = findIndexNegativeToPositive(nums)
        val negatives = nums.copyOfRange(0, indexBecomePositive)
        val positives = nums.copyOfRange(indexBecomePositive, nums.size)
        var idxNegatives = if (negatives.isNotEmpty()) negatives.size - 1 else -1
        var idxPositives = if (positives.isNotEmpty()) 0 else -1
        val sortedList = mutableListOf<Int>()
        while (true) {
            val positive = getValue(positives, idxPositives)
            val negative = getValue(negatives, idxNegatives)
            if (positive == null) {
                sortedList.add(negative!!)
                idxNegatives--
            } else if (negative == null) {
                sortedList.add(positive!!)
                idxPositives++
            } else if (-negative < positive) {
                sortedList.add(negative!!)
                idxNegatives--
            } else {
                sortedList.add(positive!!)
                idxPositives++
            }
            if (idxNegatives < 0 && ((idxPositives + 1) > positives.size)) {
                break
            }
        }
        return sortedList.map{ it * it }.toIntArray()
    }

    private fun findIndexNegativeToPositive(nums: IntArray): Int {
        for (i in nums.indices) {
            if (nums[i] >= 0) {
                return i
            }
        }
        return nums.size - 1
    }

    private fun getValue(arr: IntArray, index: Int): Int? {
        if (index < 0 || index > arr.size - 1) {
            return null
        }
        return arr[index]
    }
}