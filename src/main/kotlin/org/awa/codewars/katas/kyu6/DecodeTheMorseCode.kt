package org.awa.codewars.katas.kyu6

/**
 * https://www.codewars.com/kata/54b724efac3d5402db00065e/kotlin
 */
val MorseCode = mapOf(
    ".-" to "A",
    "-..." to "B",
    "-.-." to "C",
    "-.." to "D",
    "." to "E",
    "..-." to "F",
    "--." to "G",
    "...." to "H",
    ".." to "I",
    ".---" to "J",
    "-.-" to "K",
    ".-.." to "L",
    "--" to "M",
    "-." to "N",
    "---" to "O",
    ".--." to "P",
    "--.-" to "Q",
    ".-." to "R",
    "..." to "S",
    "-" to "T",
    "..-" to "U",
    "...-" to "V",
    ".--" to "W",
    "-..-" to "X",
    "-.--" to "Y",
    "--.." to "Z",
    ".----" to "1",
    "..---" to "2",
    "...--" to "3",
    "....-" to "4",
    "....." to "5",
    "-...." to "6",
    "--..." to "7",
    "---.." to "8",
    "----." to "9",
    "-----" to "0",
    "" to " ",
    ".-.-.-" to ".",
    "--..--" to ",",
    "---..." to ".",
    "..--.." to "?",
    "-.-.--" to "!",
    "...---..." to "SOS",
    "-....-" to "''",
    "-..-." to "/",
    "-.--.-" to "()",
    ".--.-." to "@",
    "-...-" to "="
)

fun decodeMorse(code: String) = code
    .trim()
    .split("   ")
    .joinToString(" ") { wordCode ->
        wordCode
            .split(" ")
            .joinToString("") { MorseCode[it] ?: "" }
    }

fun main() {
    println(decodeMorse(".... . -.--   .--- ..- -.. ."))
}
