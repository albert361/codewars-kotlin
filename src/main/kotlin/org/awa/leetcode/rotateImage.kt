package org.awa.leetcode

class RotateImage {
    fun rotate(matrix: Array<IntArray>): Unit {
        val maxIndex = matrix.size - 1
        for (i in 0..maxIndex / 2) {
            for (columnIndex in i..maxIndex - 1 - i) {
                val tmp = matrix[i][columnIndex]
                matrix[i][columnIndex] = matrix[maxIndex - columnIndex][i]
                matrix[maxIndex - columnIndex][i] = matrix[maxIndex - i][maxIndex - columnIndex]
                matrix[maxIndex - i][maxIndex - columnIndex] = matrix[columnIndex][maxIndex - i]
                matrix[columnIndex][maxIndex - i] = tmp
            }
        }
    }
}