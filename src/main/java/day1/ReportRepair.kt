package day1

class ReportRepair(private val sumNumberFinder: SumNumberFinder) {

    operator fun invoke(numbers: List<Int>): Int {
        val matchingNumbers = sumNumberFinder(numbers)

        return matchingNumbers.reduce { acc, num -> acc * num }
    }
}