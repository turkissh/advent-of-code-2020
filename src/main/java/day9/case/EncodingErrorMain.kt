package day9.case

import day9.FindWeaknessContiguousRange
import day9.ListOfNumbersParser
import day9.XmasWeaknessFinder

class EncodingErrorMain {

    fun exec() {
        val numbers = ListOfNumbersParser.parse(EncodingErrorCase.case)
        val xmasWeaknessFinder = XmasWeaknessFinder()
        val weaknessNumber = xmasWeaknessFinder.find(numbers, preambleSize)

        println("DAY 9-1 : Weakness number: ${weaknessNumber!!.toBigDecimal().toPlainString()}")

        val findWeaknessContiguousRange = FindWeaknessContiguousRange()
        val contiguousRange = findWeaknessContiguousRange(numbers, weaknessNumber)
        println("DAY 9-2 : Sum of min and max from the contiguous range: ${contiguousRange.min()!! + contiguousRange.max()!!}")
    }

    private companion object {
        const val preambleSize = 25
    }
}