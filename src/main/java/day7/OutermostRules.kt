package day7

data class OutermostRules(private val rules: Map<String, List<Pair<Int, String>>> = mutableMapOf()) {

    private val rulesDefinitions: MutableMap<String, MutableList<String>> = mutableMapOf()

    init {
        rules.map {
            val containerBag = it.key
            it.value.forEach { containedBag ->
                add(containedBag.second, listOf(containerBag))
            }
        }
    }

    private fun add(contentBag: String, containerBags: List<String>) {
        rulesDefinitions[contentBag] = findContainers(contentBag).toMutableList().apply { addAll(containerBags) }
    }

    fun findContainers(bag: String): List<String> {
        return rulesDefinitions[bag] ?: emptyList()
    }
}