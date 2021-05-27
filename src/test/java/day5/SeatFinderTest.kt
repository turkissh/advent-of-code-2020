package day5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.math.floor

class SeatFinderTest {

    @Test
    internal fun `boarding pass with all Fs should return first row`() {
        val boardingPass = BoardingPass("FFFFFFFLRL")
        val seatFinder = SeatFinder()

        val seat = seatFinder.seatFor(boardingPass)

        assertThat(seat.row).isEqualTo(0)
    }

    @Test
    internal fun `boarding pass with all Bs should return last row`() {
        val boardingPass = BoardingPass("BBBBBBBLRL")
        val seatFinder = SeatFinder()

        val seat = seatFinder.seatFor(boardingPass)

        assertThat(seat.row).isEqualTo(127)
    }

    @Test
    internal fun `finder should find row`() {
        val boardingPasses = listOf(
            BoardingPass("FBFBBFFRLR"),
            BoardingPass("BFFFBBFRRR"),
            BoardingPass("FFFBBBFRRR"),
            BoardingPass("BBFFBBFRLL")
        )
        val seatFinder = SeatFinder()

        val seats = boardingPasses.map { seatFinder.seatFor(it) }.map { it.row }

        assertThat(seats).containsExactly(44, 70, 14, 102)
    }

    @Test
    internal fun `finder should find column`() {
        val boardingPasses = listOf(
            BoardingPass("FBFBBFFRLR"),
            BoardingPass("BFFFBBFRRR"),
            BoardingPass("FFFBBBFRRR"),
            BoardingPass("BBFFBBFRLL")
        )
        val seatFinder = SeatFinder()

        val seats = boardingPasses.map { seatFinder.seatFor(it) }.map { it.column }

        assertThat(seats).containsExactly(5, 7, 7, 4)
    }
}

