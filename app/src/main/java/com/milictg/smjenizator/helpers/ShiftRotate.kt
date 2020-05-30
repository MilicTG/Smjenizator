package com.milictg.smjenizator.helpers

import java.util.*

class ShiftRotate {

    private var shiftStartArray = listOf(
        Pair("Prva smjena", "dan prvi"),
        Pair("Prva smjena", "dan drugi"),
        Pair("Druga smjena", "dan prvi"),
        Pair("Druga smjena", "dan drugi"),
        Pair("Treca smjena", "dan prvi"),
        Pair("Treca smjena", "dan drugi"),
        Pair("Slobodan dan", "dan prvi"),
        Pair("Slobodan dan", "dan drugi"),
        Pair("Prva smjena", "dan prvi"),
        Pair("Prva smjena", "dan drugi"),
        Pair("Druga smjena", "dan prvi"),
        Pair("Druga smjena", "dan drugi"),
        Pair("Treca smjena", "dan prvi"),
        Pair("Treca smjena", "dan drugi"),
        Pair("Slobodan dan", "dan prvi"),
        Pair("Slobodan dan", "dan drugi"),
        Pair("Prva smjena", "dan prvi"),
        Pair("Prva smjena", "dan drugi"),
        Pair("Druga smjena", "dan prvi"),
        Pair("Druga smjena", "dan drugi"),
        Pair("Treca smjena", "dan prvi"),
        Pair("Treca smjena", "dan drugi"),
        Pair("Slobodan dan", "dan prvi"),
        Pair("Slobodan dan", "dan drugi"),
        Pair("Prva smjena", "dan prvi"),
        Pair("Prva smjena", "dan drugi"),
        Pair("Druga smjena", "dan prvi"),
        Pair("Druga smjena", "dan drugi"),
        Pair("Treca smjena", "dan prvi"),
        Pair("Treca smjena", "dan drugi"),
        Pair("Slobodan dan", "dan prvi"),
        Pair("Slobodan dan", "dan drugi")
    )

    fun getRotatedShifts(daysDifference: Int) : List<Pair<String, String>>{
        Collections.rotate(shiftStartArray, daysDifference)
        return shiftStartArray
    }
}