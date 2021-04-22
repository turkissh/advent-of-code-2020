package day1

class SumNumberPairFinder(private val target: Int) {

    operator fun invoke(numbers: List<Int>): Pair<Int,Int> {
        val arrayList = mutableListOf<Int>()

        numbers.forEach { num ->
            if (arrayList.contains(num)) {
                return Pair(num, target - num)
            } else {
                arrayList.add(target - num)
            }
        }

        throw NumberNotMatchingException()
    }
}