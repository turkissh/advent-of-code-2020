package day7

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountContainingBagsTest {

    @Test
    internal fun `contains zero bags should return 0`() {
        val containingRules = ContainingRules(mapOf(Pair(shinyBag, emptyList())))
        val countContainingBags = CountContainingBags()

        val count = countContainingBags(shinyBag, containingRules)

        assertThat(count).isEqualTo(0)
    }

    @Test
    internal fun `contains one bags should return 1`() {
        val containingRules = ContainingRules(mapOf(Pair(shinyBag, listOf(Pair(1, darkGreen)))))
        val countContainingBags = CountContainingBags()

        val count = countContainingBags(shinyBag, containingRules)

        assertThat(count).isEqualTo(1)
    }

    @Test
    internal fun `contains one bags should return 3`() {
        val containingRules = ContainingRules(mapOf(Pair(shinyBag, listOf(Pair(2, darkGreen), Pair(1, lightBlue)))))
        val countContainingBags = CountContainingBags()

        val count = countContainingBags(shinyBag, containingRules)

        assertThat(count).isEqualTo(3)
    }

    @Test
    internal fun `count bags inside other bags`() {
        val containingRules = ContainingRules(
            mapOf(
                Pair(shinyBag, listOf(Pair(1, darkOlive), Pair(2, vibrantPlum))),
                Pair(darkOlive, listOf(Pair(3, fadedBlue), Pair(4, dottedBlack))),
                Pair(vibrantPlum, listOf(Pair(5, fadedBlue), Pair(6, dottedBlack))),
                Pair(dottedBlack, emptyList()),
                Pair(fadedBlue, emptyList())
            )
        )
        val countContainingBags = CountContainingBags()

        val count = countContainingBags(shinyBag, containingRules)

        assertThat(count).isEqualTo(32)
    }

    private companion object {
        const val shinyBag = "shiny gold"
        const val lightBlue = "light blue"
        const val fadedBlue = "faded blue"
        const val vibrantPlum = "vibrant plum"
        const val dottedBlack = "dotted black"
        const val darkOlive = "dark olive"
        const val darkGreen = "dark green"
    }
}

