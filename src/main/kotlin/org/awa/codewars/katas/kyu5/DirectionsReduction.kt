package org.awa.codewars.katas.kyu5

import kotlin.concurrent.fixedRateTimer
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.lastOrNull
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    var i = 0;
    val flow = MutableSharedFlow<Int>()
    runBlocking {
        launch {
            val result = flow.lastOrNull()
            println("result is $result")
        }
        fixedRateTimer(name = "scaler-iteration", period = 3000, initialDelay = 3000, daemon = false) {
            println("iteration - start")
            runBlocking {
                flow.emit(i++)
            }
            println("iteration - end")
        }
    }
}