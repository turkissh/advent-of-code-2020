package day5

class MissingSeatFinder {

    fun find(ids: List<Int>): Int? {

        val sortedIds = ids.sorted()
        var expectedId = sortedIds.minOrNull()

        sortedIds.forEach {
            if (it != expectedId) return expectedId
            expectedId++
        }

        return null
    }
}