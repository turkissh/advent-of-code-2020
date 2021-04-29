package day2

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PasswordEntryParserTest {

    @Test
    fun `parses the input`() {
        val parser = PasswordEntryParser()
        val input = """1-3 a: abcde
            1-3 b: cdefg
            2-9 c: ccccccccc"""

        val expectedEntries = listOf(
            PasswordEntry(Policy('a', 1, 3), "abcde"),
            PasswordEntry(Policy('b', 1, 3), "cdefg"),
            PasswordEntry(Policy('c', 2, 9), "ccccccccc")
        )

        val entries = parser.parse(input)

        assertThat(entries).containsAll(expectedEntries)
    }

}

class PasswordEntryParser {
    fun parse(input: String): List<PasswordEntry> {
        return input.lines().map { line ->
            val splitedLine = line.trim().split(" ")

            val (min, max) = splitedLine[0].split("-").let { Pair(it[0].toInt(), it[1].toInt()) }
            val character = splitedLine[1][0]
            val password = splitedLine[2]

            PasswordEntry(Policy(character, min, max), password)
        }
    }

}
