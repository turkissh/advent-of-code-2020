package day5.case

import day5.BoardingPassParser
import day5.MissingSeatFinder
import day5.SeatFinder

class BinaryBoardingMain {

    fun exec() {
        val boardingPasses = BoardingPassParser().parse(BinaryBoardingCase.case)
        val finder = SeatFinder()
        val passportIds = boardingPasses.map { finder.seatFor(it).id }

        println("DAY 5-1 : Maximum Passport ID: ${passportIds.maxOrNull()}")

        println("DAY 5-2 : Missing Passport ID: ${MissingSeatFinder().find(passportIds)}")
    }
}