package day9.case

import day9.ListOfNumbersParser
import day9.XmasWeaknessFinder

class EncodingErrorMain {

    fun exec() {
        val numbers = ListOfNumbersParser.parse(EncodingErrorCase.case)
        val xmasWeaknessFinder = XmasWeaknessFinder()

        println("DAY 9-1 : Weakness number: ${xmasWeaknessFinder.find(numbers, preambleSize)!!.toBigDecimal().toPlainString()}")
    }

    private companion object {
        const val preambleSize = 25
    }
}