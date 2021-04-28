package day1.case

import day1.ReportRepair
import day1.SumNumberPairFinder
import day1.SumNumbersTripletFinder

class ReportRepairMain {
    fun pairs() {
        val matcher = SumNumberPairFinder(2020)
        val reportRepair = ReportRepair(matcher)

        val result = reportRepair(ReportRepairCase.numbers)

        println("Pair -> the multiply is: $result")
    }
    
    fun triplets() {
        val matcher = SumNumbersTripletFinder(2020)
        val reportRepair = ReportRepair(matcher)

        val result = reportRepair(ReportRepairCase.numbers)

        println("Triplet -> the multiply is: $result")
    }
}