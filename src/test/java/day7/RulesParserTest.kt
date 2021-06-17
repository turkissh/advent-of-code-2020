package day7

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RulesParserTest {

    @Test
    fun `parse rule containing one bag`() {
        val input = """
            bright white bags contain 1 shiny gold bag.
        """.trimIndent()
        val parser = RulesParser()

        val rules = parser.parse(input)

        assertThat(rules).isEqualTo(Rules().apply { add("shiny gold", listOf("bright white")) })
    }

    @Test
    fun `parse rule containing two bags`() {
        val input = """
            light red bags contain 1 bright white bag, 2 muted yellow bags.
        """.trimIndent()
        val parser = RulesParser()
        val expectedRule = Rules().apply {
            add("bright white", listOf("light red"))
            add("muted yellow", listOf("light red"))
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
        val expectedRule = Rules().apply {
            add("bright aqua", listOf("plaid teal"))
            add("posh olive", listOf("plaid teal"))
            add("shiny white", listOf("plaid teal"))
            add("dotted beige", listOf("plaid teal"))
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
        val expectedRule = Rules()

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
        val expectedRule = Rules().apply {
            add("bright white", listOf("light red", "dark orange"))
            add("muted yellow", listOf("light red", "dark orange"))
            add("shiny gold", listOf("bright white"))
        }

        val rules = parser.parse(input)

        assertThat(rules).isEqualTo(expectedRule)
    }
}

