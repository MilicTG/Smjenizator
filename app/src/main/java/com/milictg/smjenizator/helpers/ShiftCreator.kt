package com.milictg.smjenizator.helpers


import com.milictg.smjenizator.model.ShiftPattern
import java.text.SimpleDateFormat
import java.util.*

class ShiftCreator {

    private val dateFormat = SimpleDateFormat("dd.MM.yyyy")
    private val localeFormat = SimpleDateFormat("EEEE", Locale("hr", "HR"))


    fun calculateShifts() {
        val dayOne = dateFormat.parse("30.05.2020")
        val dayTwo = localeFormat.calendar.time
        val dayDifference: Int = (dayOne.time - dayTwo.time).toInt() / (1000 * 60 * 60 * 24)

        //get enum in some list

//        Collections.rotate(shiftList, dayDifference)
    }

}