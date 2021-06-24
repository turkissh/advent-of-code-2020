package day7

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FindOutermostBagsTest {

    @Test
    fun `one bag can contain the shiny gold bag`() {
        val rules = OutermostRules(mapOf(Pair(lightBlue, listOf(Pair(1, shinyBag)))))
        val findOutermostBags = FindOutermostBags()

        val containerBags = findOutermostBags(shinyBag, rules)

        assertThat(containerBags).containsExactly(lightBlue)
    }

    @Test
    fun `one bag contains other bag that contains the shiny gold bag`() {
        val rules = OutermostRules(mapOf(Pair(lightBlue, listOf(Pair(1, shinyBag))), Pair(darkOlive, listOf(Pair(1, lightBlue)))))

        val findOutermostBags = FindOutermostBags()

        val containerBags = findOutermostBags(shinyBag, rules)

        assertThat(containerBags).containsExactlyInAnyOrder(lightBlue, darkOlive)
    }

    @Test
    fun `repeated bags are counted once`() {
        val rules = OutermostRules(
            mapOf(
                Pair(lightBlue, listOf(Pair(1, shinyBag))), Pair(pinkyRed, listOf(Pair(1, shinyBag), Pair(1, darkOlive))),
                Pair(darkOlive, listOf(Pair(1, lightBlue))), Pair(darkGreen, listOf(Pair(1, darkOlive)))
            )
        )

        val findOutermostBags = FindOutermostBags()

        val containerBags = findOutermostBags(shinyBag, rules)

        assertThat(containerBags).containsExactlyInAnyOrder(lightBlue, darkOlive, pinkyRed, darkGreen)
    }

    @Test
    fun `bag not contained by any other bag`() {
        val rules = OutermostRules(
            mapOf(
                Pair(darkOlive, listOf(Pair(1, lightBlue))), Pair(pinkyRed, listOf(Pair(1, darkOlive))),
                Pair(darkGreen, listOf(Pair(1, darkOlive)))
            )
        )

        val findOutermostBags = FindOutermostBags()

        val containerBags = findOutermostBags(shinyBag, rules)

        assertThat(containerBags).isEmpty()
    }

    private companion object {
        const val shinyBag = "shiny gold"
        const val lightBlue = "light blue"
        const val darkOlive = "dark olive"
        const val pinkyRed = "pinky red"
        const val darkGreen = "dark green"
    }
}

