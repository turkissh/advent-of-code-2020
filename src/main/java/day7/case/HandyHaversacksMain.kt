package day7.case

import day7.*

class HandyHaversacksMain {
    fun exec() {
        val rules = RulesParser().parse(HandyHaversacksCase.case)
        val findOutermostBags = FindOutermostBags()
        val countContainedBags = CountContainingBags()

        val outermostBags = findOutermostBags("shiny gold", OutermostRules(rules))
        val containedBags = countContainedBags("shiny gold", ContainingRules(rules))

        println("DAY 7-1 : Outermost bags that could contain shiny gold bags: ${outermostBags.size}")
        println("DAY 7-2 : Contained bags that inside a shiny gold bag: $containedBags")
    }
}