package day1

interface SumNumberFinder {

    operator fun invoke(numbers: List<Int>): List<Int>

}