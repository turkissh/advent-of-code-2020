package day3

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatternParserTest {

    @Test
    internal fun `create a pattern from a string`() {
        val rawPattern = """ 
            ..##.......
            #.......#..
            .#.......#."""

        val parser = PatternParser()

        val pattern = parser.parse(rawPattern)

        assertThat(pattern).isEqualTo(expectedPattern)
    }

    private companion object {
        val expectedPattern = Pattern(
            3, 11, setOf(
                Position(1, 3),
                Position(1, 4),
                Position(2, 1),
                Position(2, 9),
                Position(3, 2),
                Position(3, 10)
            )
        )
    }
}

