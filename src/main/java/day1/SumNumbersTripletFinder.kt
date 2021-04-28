package day1

import day1.exceptions.EntriesNotFound

class SumNumbersTripletFinder(private val target: Int) : SumNumberFinder {
    override fun invoke(numbers: List<Int>): List<Int> {
        val missingPairs = createMissingPairs(numbers)

        numbers.forEach { num ->
            missingPairs[num]?.let {
                if (!it.toList().contains(num)) {
                    return it.toList().plus(num)
                }
            }
        }

        throw EntriesNotFound()
    }

    private fun createMissingPairs(numbers: List<Int>): MutableMap<Int, Pair<Int, Int>> {
        val numbersToFind: MutableMap<Int, Pair<Int, Int>> = mutableMapOf()
        numbers.forEach { num1 ->
            numbers.forEach { num2 ->
                val numberToFind = target - num1 - num2
                numbersToFind[numberToFind] = Pair(num1, num2)
            }
        }
        return numbersToFind
    }

}