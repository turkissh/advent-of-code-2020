package day7

class RulesParser {
    fun parse(input: String): Map<String, List<Pair<Int, String>>> {
        val rules = mutableMapOf<String, List<Pair<Int, String>>>()

        input.lines().map { line ->
            val lineWords = line.split(" ")

            if (containsAnotherBag(lineWords)) {
                val containerBagColor = getContainerBagColor(lineWords)
                val containedBags = getContainedBags(lineWords, line)

                rules.put(containerBagColor, containedBags)
            }
        }

        return rules
    }

    private fun getContainedBags(lineWords: List<String>, line: String): List<Pair<Int, String>> {
        val containedBags = mutableListOf(getFirstContainedBag(lineWords))
        containedBags.addAll(getRemainingBags(line))
        return containedBags
    }

    private fun getRemainingBags(line: String): List<Pair<Int, String>> {
        val containedBags = mutableListOf<Pair<Int, String>>()

        val containedDelimiterIndex = line.indexOf(",")
        if (containedDelimiterIndex > 0) {
            val otherContainedBags = line.subSequence(containedDelimiterIndex + 1, line.length)
            otherContainedBags.split(",").forEach { words ->
                val bagQuantity = words.split(" ")[1].toInt()
                val bagColor = words.split(" ").subList(2, 4).joinToString(" ")
                containedBags.add(Pair(bagQuantity, bagColor))
            }
        }

        return containedBags
    }

    private fun getFirstContainedBag(lineWords: List<String>) = Pair(
        lineWords[4].toInt(),
        lineWords.subList(5, 7).joinToString(" ")
    )


    private fun getContainerBagColor(lineWords: List<String>) = lineWords.subList(0, 2).joinToString(" ")

    private fun containsAnotherBag(lineWords: List<String>) = lineWords[4] != "no"
}