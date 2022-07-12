package org.awa.codewars.katas.kyu6

/**
 * https://www.codewars.com/kata/517abf86da9663f1d2000003/kotlin
 */
fun toCamelCase(str:String):String = """[-_]([a-z]{0,1})""".toRegex().replace(str) {
    """[-_]""".toRegex().replace(it.value.uppercase(), "")
}

fun main() {
    println(toCamelCase(""))
    println(toCamelCase("the_stealth_warrior"))
    println(toCamelCase("The-Stealth-Warrior"))
    println(toCamelCase("A-B-C"))
}