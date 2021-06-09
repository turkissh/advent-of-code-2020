package day5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BoardingPassParserTest {

    @Test
    internal fun `parse multiple`() {
        val input = """
            FBFBBBFRLL
            BFFFBFFRRR
            BBFBFFFLLR
        """.trimIndent()

        val parser = BoardingPassParser()

        val boardingPasses = parser.parse(input)

        assertThat(boardingPasses).containsExactly(
            BoardingPass("FBFBBBFRLL"),
            BoardingPass("BFFFBFFRRR"),
            BoardingPass("BBFBFFFLLR"))
    }
}