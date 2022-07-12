package org.awa.leetcode

fun main() {
    val result = ValidSudoku().isValidSudoku(
        arrayOf(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )
    )
    println(result)
}

class ValidSudoku {
    companion object Constants {
        val columns = 9
        val placeholder = '.'
    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        if (!areThereNoDuplicatedInRows(board)) {
            return false
        }
        if (!areThereNoDuplicatedInColumns(board)) {
            return false
        }

        for (rowGroup in 0 until 3) {
            for (columnGroup in 0 until 3) {
                if (!validateBlock(board, rowGroup, columnGroup)) {
                    return false
                }
            }
        }
        return true
    }

    private fun areThereNoDuplicatedInRows(board: Array<CharArray>): Boolean {
        return board.all { row ->
            val tempSet = mutableSetOf<Char>()
            for (char in row) {
                if (char == placeholder) {
                    continue
                }
                if (char in tempSet) {
                    return@all false
                }
                tempSet.add(char)
            }
            return@all true
        }
    }

    private fun areThereNoDuplicatedInColumns(board: Array<CharArray>): Boolean {
        return (0 until columns).toList().all { i ->
            val tempSet = mutableSetOf<Char>()
            for (row in board) {
                val char = row[i]
                if (char == placeholder) {
                    continue
                }
                if (char in tempSet) {
                    return@all false
                }
                tempSet.add(char)
            }
            return@all true
        }
    }

    private fun validateBlock(board: Array<CharArray>, rowGroup: Int, columnGroup: Int): Boolean {
        val tempSet = mutableSetOf<Char>()
        val startRow = rowGroup * 3
        val startColumn = columnGroup * 3
        for (r in 0 until 3) {
            for (c in 0 until 3) {
                val rIndex = startRow + r
                val cIndex = startColumn + c
                val char = board[rIndex][cIndex]!!
                if (char == placeholder) {
                    continue
                }
                if (char in tempSet) {
                    return false
                }
                tempSet.add(char)
            }
        }
        return true
    }
}
