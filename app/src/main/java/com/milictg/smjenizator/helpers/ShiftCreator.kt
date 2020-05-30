package com.milictg.smjenizator.helpers

import java.text.SimpleDateFormat
import java.util.*

class ShiftCreator {

    private val dateFormat = SimpleDateFormat("dd.MM.yyyy")
    private val localeFormat = SimpleDateFormat("EEEE", Locale("hr", "HR"))

    fun calculateShifts() : List<Pair<String, String>> {
        val dayOne = dateFormat.parse("30.05.2020")
        val dayTwo = localeFormat.calendar.time
        val dayDifference: Int = (dayOne.time - dayTwo.time).toInt() / (1000 * 60 * 60 * 24)

        return ShiftRotate().getRotatedShifts(dayDifference)
    }
}