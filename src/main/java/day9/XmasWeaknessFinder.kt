package day9

import java.math.BigInteger

class XmasWeaknessFinder {
    fun find(numbers: List<BigInteger>, preambleSize: Int): BigInteger? {
        return getNumberIfGeneratesAWeakness(numbers, preambleSize, preambleSize)
    }

    private fun getNumberIfGeneratesAWeakness(numbers: List<BigInteger>, preambleSize: Int, checkingNumberIndex: Int): BigInteger? {
        if (checkingNumberIndex >= numbers.size) return null

        val checkingNumber = numbers[checkingNumberIndex]
        val preambleNumbers = getPreambleNumbers(numbers, preambleSize, checkingNumberIndex)

        return if (isAWeakness(checkingNumber, preambleNumbers)) {
            checkingNumber
        } else {
            getNumberIfGeneratesAWeakness(numbers, preambleSize, checkingNumberIndex + 1)
        }
    }

    private fun isAWeakness(checkingNumber: BigInteger, preambleNumbers: List<BigInteger>): Boolean {
        val complementNumbers = calculateComplementOf(preambleNumbers, checkingNumber)
        return preambleNumbers.none { complementNumbers.contains(it) }
    }

    private fun getPreambleNumbers(numbers: List<BigInteger>, preambleSize: Int, checkingNumberIndex: Int): List<BigInteger> {
        return numbers.subList(checkingNumberIndex - preambleSize, checkingNumberIndex)
    }

    private fun calculateComplementOf(preambleNumbers: List<BigInteger>, checkingNumber: BigInteger): Set<BigInteger> {
        return preambleNumbers.map { checkingNumber - it }.toSet()
    }
}