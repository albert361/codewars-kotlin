package org.awa.leetcode

fun main() {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
    println(maxProfit(intArrayOf(1,2,3,4,5)))
    println(maxProfit(intArrayOf(7,6,4,3,1)))
}

fun maxProfit(prices: IntArray): Int {
    var sum = 0
    prices.forEachIndexed { index, value ->
        if (index == 0) return@forEachIndexed
        if (value > prices[index - 1]) {
            sum += (value - prices[index - 1])
        }
    }
    return sum
}
