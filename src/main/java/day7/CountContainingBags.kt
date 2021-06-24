package day7

class CountContainingBags {
    operator fun invoke(bagColor: String, rules: ContainingRules): Int {
        return count(bagColor, rules)
    }

    private fun count(bagColor: String, rules: ContainingRules): Int {
        return rules.contentOf(bagColor)
            .fold(0, { acc, bag -> acc + bag.first + bag.first * count(bag.second, rules) })
    }
}