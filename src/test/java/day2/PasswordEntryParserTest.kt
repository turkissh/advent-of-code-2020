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

