package day5

import kotlin.math.ceil
import kotlin.math.floor

class SeatFinder {
    fun seatFor(boardingPass: BoardingPass): Seat {
        val row = findRow(boardingPass)
        val column = findColumn(boardingPass)
        return Seat(row, column)
    }

    private fun findRow(boardingPass: BoardingPass) = binarySearch(BoardingPass.rowCount, boardingPass.rowCode, BoardingPass.lowerHalfRowCharacter)
    private fun findColumn(boardingPass: BoardingPass) = binarySearch(
        BoardingPass.columnCount, boardingPass.columnCode,
        BoardingPass.lowerHalfColumnCharacter
    )

    private fun binarySearch(length: Int, code: String, lowerHalfChar: Char): Int {
        var min = 0
        var max = length - 1

        for (char in code) {
            if (char == lowerHalfChar) {
                max = floor((min + max).toDouble() / 2f).toInt()
            } else {
                min = ceil((min + max).toDouble() / 2f).toInt()
            }
        }

        return max
    }
}