package day1

class SumNumberPairFinder(private val target: Int): SumNumberFinder {

    override operator fun invoke(numbers: List<Int>): List<Int> {
        val arrayList = mutableListOf<Int>()

        numbers.forEach { num ->
            if (arrayList.contains(num)) {
                return listOf(num, target - num)
            } else {
                arrayList.add(target - num)
            }
        }

        throw NumberNotMatchingException()
    }
}