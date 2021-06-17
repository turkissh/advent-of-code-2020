package day7

data class Rules(private val rulesDefinitions: MutableMap<String, List<String>> = mutableMapOf()) {
    fun add(contentBag: String, containerBags: List<String>) {
        rulesDefinitions[contentBag] = findContainers(contentBag).toMutableList().apply { addAll(containerBags) }
    }

    fun findContainers(bag: String): List<String> {
        return rulesDefinitions[bag] ?: emptyList()
    }
}