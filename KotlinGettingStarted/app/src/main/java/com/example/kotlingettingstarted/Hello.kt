/**
 * Lessons 1 and 2 Learning Paths
 *
 * @author Jitendra Rawat
 */
package com.example.kotlingettingstarted

import java.util.Random

fun main(args: Array<String>) {
    println("Hello, world!")


    val isUnit = println("\nThis is an expression")
    println(isUnit)

    println("")
    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

    println("")
    feedTheFish()

    println("")
    swim()

    println("")
    feedTheFishAgain()

    println("")
    println( decorations.filter {it[0] == 'p'})

    println("")
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println ("Today is $day and the fish eat $food")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}


fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}

fun feedTheFishAgain() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}


fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"


fun shouldChangeWaterAgain (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}


val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

