package day1

class ReportRepair(private val sumNumberPairFinder: SumNumberPairFinder) {

    operator fun invoke(numbers: List<Int>): Int {
        val matchingPair = sumNumberPairFinder(numbers)

        println("numbers are ${matchingPair.first} & ${matchingPair.second}")
        return matchingPair.first * matchingPair.second
    }
}