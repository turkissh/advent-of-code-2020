package day6

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GroupAnswersParserTest {

    @Test
    internal fun parse() {
        val case = """
            abc

            a
            b
            c
        """.trimIndent()
        val parser = GroupAnswersParser()

        val groupAnswers = parser.parse(case)

        assertThat(groupAnswers).containsExactly(
            GroupAnswers(listOf("abc")),
            GroupAnswers(listOf("a", "b", "c"))
        )
    }
}

