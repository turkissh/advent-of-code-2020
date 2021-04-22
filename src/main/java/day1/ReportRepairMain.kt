package day1

class ReportRepairMain {
    operator fun invoke() {
        val matcher = SumNumberPairFinder(2020)
        val reportRepair = ReportRepair(matcher)

        val result = reportRepair(ReportRepairCase.numbers)

        println("the multiply is: $result")
    }
}