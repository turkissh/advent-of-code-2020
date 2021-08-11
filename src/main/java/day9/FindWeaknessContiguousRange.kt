package day9

import java.math.BigInteger

class FindWeaknessContiguousRange {

    operator fun invoke(numbers: List<BigInteger>, weaknessNumber: BigInteger): List<BigInteger> {

        val numbersToCheck = getNumbersToCheck(numbers, weaknessNumber)

        for (indexedNumber in numbersToCheck.withIndex()) {
            findContiguousNumbers(indexedNumber, numbersToCheck, weaknessNumber)?.let { return it }
        }

        return emptyList()
    }

    private fun findContiguousNumbers(
        indexedNumber: IndexedValue<BigInteger>, numbersToCheck: List<BigInteger>,
        weaknessNumber: BigInteger
    ): List<BigInteger>? {

        var sum = indexedNumber.value
        val tailNumbers = getTailNumbersFrom(indexedNumber.index, numbersToCheck)

        for (indexedTailNumber in tailNumbers.withIndex()) {
            sum += indexedTailNumber.value

            if (sum == weaknessNumber) {
                return getContiguousNumbers(tailNumbers, indexedTailNumber, indexedNumber)
            }
        }
        return null
    }

    private fun getContiguousNumbers(
        tailNumbers: List<BigInteger>,
        indexedTailNumber: IndexedValue<BigInteger>,
        indexedNumber: IndexedValue<BigInteger>
    ): List<BigInteger> {
        return tailNumbers.subList(0, indexedTailNumber.index + 1).toMutableList().apply { add(0, indexedNumber.value) }
    }

    private fun getTailNumbersFrom(indexedNumber: Int, numbersToCheck: List<BigInteger>) =
        numbersToCheck.subList(indexedNumber + 1, numbersToCheck.count())

    private fun getNumbersToCheck(numbers: List<BigInteger>, weaknessNumber: BigInteger): List<BigInteger> {
        val weaknessNumberIndex = numbers.indexOf(weaknessNumber)
        return numbers.subList(0, weaknessNumberIndex)
    }
}