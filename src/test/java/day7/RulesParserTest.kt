package day7

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

typealias ContainerBag = String
typealias ContainedBags = List<Pair<Int, String>>

class RulesParserTest {

    @Test
    fun `parse rule containing one bag`() {
        val input = """
            bright white bags contain 1 shiny gold bag.
        """.trimIndent()
        val parser = RulesParser()
        val expectedRules = mapOf(Pair("bright white", listOf(Pair(1, "shiny gold"))))

        val rules = parser.parse(input)

        assertThat(rules).isEqualTo(expectedRules)
    }

    @Test
    fun `parse rule containing two bags`() {
        val input = """
            light red bags contain 1 bright white bag, 2 muted yellow bags.
        """.trimIndent()
        val parser = RulesParser()
        val expectedRule = mutableMapOf<ContainerBag, ContainedBags>().apply {
            put("light red", listOf(Pair(1, "bright white"), Pair(2, "muted yellow")))
        }

        val rules = parser.parse(input)

        assertThat(rules).isEqualTo(expectedRule)
    }

    @Test
    fun `parse rule containing more than two bags`() {
        val input = """
            plaid teal bags contain 2 bright aqua bags, 1 posh olive bag, 4 shiny white bags, 3 dotted beige bags.
        """.trimIndent()
        val parser = RulesParser()
        val expectedRule = mutableMapOf<ContainerBag, ContainedBags>().apply {
            put("plaid teal", listOf(Pair(2, "bright aqua"), Pair(1, "posh olive"), Pair(4, "shiny white"), Pair(3, "dotted beige")))
        }

        val rules = parser.parse(input)

        assertThat(rules).isEqualTo(expectedRule)
    }

    @Test
    fun `parse rule not containing bags`() {
        val input = """
            faded blue bags contain no other bags.
        """.trimIndent()
        val parser = RulesParser()
        val expectedRule = mutableMapOf<ContainerBag, ContainedBags>()

        val rules = parser.parse(input)

        assertThat(rules).isEqualTo(expectedRule)
    }

    @Test
    fun `parse multiple lines`() {
        val input = """
            light red bags contain 1 bright white bag, 2 muted yellow bags.
            dark orange bags contain 3 bright white bags, 4 muted yellow bags.
            bright white bags contain 1 shiny gold bag.
        """.trimIndent()
        val parser = RulesParser()
        val expectedRule = mutableMapOf<ContainerBag, ContainedBags>().apply {
            put("light red", listOf(Pair(1, "bright white"), Pair(2, "muted yellow")))
            put("dark orange", listOf(Pair(3, "bright white"), Pair(4, "muted yellow")))
            put("bright white", listOf(Pair(1, "shiny gold")))
        }

        val rules = parser.parse(input)

        assertThat(rules).isEqualTo(expectedRule)
    }
}

