package day7

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FindOutermostBagsTest {

    @Test
    fun `one bag can contain the shiny gold bag`() {
        val rules = Rules().apply { add(shinyBag, listOf("light blue")) }
        val findOutermostBags = FindOutermostBags()

        val containerBags = findOutermostBags(shinyBag, rules)

        assertThat(containerBags).containsExactly("light blue")
    }

    @Test
    fun `one bag contains other bag that contains the shiny gold bag`() {
        val rules = Rules().apply {
            add(shinyBag, listOf(lightBlue))
            add(lightBlue, listOf(darkOlive))
        }
        val findOutermostBags = FindOutermostBags()

        val containerBags = findOutermostBags(shinyBag, rules)

        assertThat(containerBags).containsExactlyInAnyOrder(lightBlue, darkOlive)
    }

    @Test
    fun `repeated bags are counted once`() {
        val rules = Rules().apply {
            add(shinyBag, listOf(lightBlue, pinkyRed))
            add(lightBlue, listOf(darkOlive))
            add(darkOlive, listOf(pinkyRed, darkGreen))
        }
        val findOutermostBags = FindOutermostBags()

        val containerBags = findOutermostBags(shinyBag, rules)

        assertThat(containerBags).containsExactlyInAnyOrder(lightBlue, darkOlive, pinkyRed, darkGreen)
    }

    @Test
    fun `bag not contained by any other bag`() {
        val rules = Rules().apply {
            add(shinyBag, listOf())
            add(lightBlue, listOf(darkOlive))
            add(darkOlive, listOf(pinkyRed, darkGreen))
        }
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

