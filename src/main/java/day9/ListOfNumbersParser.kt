package day9

import java.math.BigInteger

class ListOfNumbersParser {
    companion object {
        fun parse(input: String) : List<BigInteger> {
            return input.lines().map { it.toBigInteger() }
        }
    }
}