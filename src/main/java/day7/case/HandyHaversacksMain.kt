package day7.case

import day7.FindOutermostBags
import day7.RulesParser

class HandyHaversacksMain {
    fun exec() {
        val rules = RulesParser().parse(HandyHaversacksCase.case)
        val findOutermostBags = FindOutermostBags()

        val outermostBags = findOutermostBags("shiny gold", rules)

        println("DAY 7-1 : Outermost bags that could contain gold shiny bags: ${outermostBags.size}")
    }
}