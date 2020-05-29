package com.milictg.smjenizator.model

enum class ShiftPattern(val currentShift: String) {
    PrvaDanPrvi("Prva smjena - dan prvi"),
    PrvaDanDrugi("Prva smjena - dan drugi"),
    DrugaDanPrvi("Prva smjena - dan prvi"),
    DugaDanDrugi("Prva smjena - dan drugi"),
    TrecaDanPrvi("Prva smjena - dan prvi"),
    TrecaDanDrugi("Prva smjena - dan drugi"),
    SlobodanDanPrvi("Prva smjena - dan prvi"),
    SlodanDanDrugi("Prva smjena - dan drugi")
}