package day7

class FindOutermostBags {
    operator fun invoke(targetBag: String, rules: day7.Rules): Set<String> {
        val result = mutableSetOf<String>()

        val containerBags = rules.findContainers(targetBag)
        result.addAll(containerBags)

        containerBags.forEach {
            result.addAll(invoke(it, rules))
        }

        return result
    }
}