package day5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SeatTest {

    @Test
    internal fun `calculate seat id`() {
        val seats = listOf(
            Seat(44, 5),
            Seat(70, 7),
            Seat(14, 7),
            Seat(102, 4)
        )

        val ids = seats.map { it.id }

        assertThat(ids).containsExactly(357, 567, 119, 820)
    }
}