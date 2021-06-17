package day7

class RulesParser {
    fun parse(input: String): Rules {
        val rules = Rules()
        input.lines().map {
            val lineWords = it.split(" ")

            if(lineWords[4] != "no") {
                val containerBag = lineWords.subList(0, 2).joinToString(" ")

                val containedDelimiterIndex = it.indexOf(",")

                val containedBags = mutableListOf(lineWords.subList(5, 7).joinToString(" "))

                if (containedDelimiterIndex > 0) {
                    val otherContainedBags = it.subSequence(containedDelimiterIndex + 1, it.length)
                    otherContainedBags.split(",").forEach { words ->
                        val bag = words.split(" ").subList(2, 4).joinToString(" ")
                        containedBags.add(bag)
                    }
                }

                containedBags.forEach { bag ->
                    rules.add(bag, listOf(containerBag))
                }
            }
        }

        return rules
    }
}