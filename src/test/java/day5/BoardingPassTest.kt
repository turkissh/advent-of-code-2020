package day5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BoardingPassTest {

    @Test
    internal fun `When create a boarding pass row code is provided`() {
        val boardingPassCode = "FBFBBFFRLR"

        val boardingPass = BoardingPass(boardingPassCode)

        assertThat(boardingPass.rowCode).isEqualTo("FBFBBFF")
    }

    @Test
    internal fun `When create a boarding pass colum code is provided`() {
        val boardingPassCode = "FBFBBFFRLR"

        val boardingPass = BoardingPass(boardingPassCode)

        assertThat(boardingPass.columnCode).isEqualTo("RLR")
    }
}

