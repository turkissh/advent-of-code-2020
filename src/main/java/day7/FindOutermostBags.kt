package day7

class FindOutermostBags {
    operator fun invoke(targetBag: String, rules: OutermostRules): Set<String> {
        val result = mutableSetOf<String>()

        val containerBags = rules.findContainers(targetBag)
        result.addAll(containerBags)

        containerBags.forEach {
            result.addAll(invoke(it, rules))
        }

        return result
    }
}