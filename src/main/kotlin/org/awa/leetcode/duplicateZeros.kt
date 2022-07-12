package org.awa.leetcode

class DuplicateZeros {
    fun duplicateZeros(arr: IntArray): Unit {
        val maxIndex = arr.size - 1
        var n = arr.filter { it == 0 }.count()
        for (i in maxIndex downTo 0) {
            if (arr[i] == 0) {
                n--
                if ((i + n) <= maxIndex) {
                    arr[i + n] = 0
                }
                if ((i + n + 1) <= maxIndex) {
                    arr[i + n + 1] = 0
                }
            } else {
                if ((i + n) <= maxIndex) {
                    arr[i + n] = arr[i]
                }
            }
            if (n == 0) {
                return
            }
        }
    }
}