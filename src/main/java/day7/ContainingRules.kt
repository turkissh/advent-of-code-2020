package day7

class ContainingRules(private val rules: Map<String, List<Pair<Int, String>>>) {
    fun contentOf(bagColor: String): List<Pair<Int, String>>  = rules[bagColor] ?: emptyList()
}
