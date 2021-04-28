package day1

import day1.exceptions.EntriesNotFound
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ReportRepairTest {

    @Test
    internal fun `when two numbers sum 2020 should return the multiply`() {
        val sumNumberPairFinder = SumNumberPairFinder(2020)
        val reportRepair = ReportRepair(sumNumberPairFinder)

        val solution = reportRepair(NUMBERS_SUMMING_2020)

        assertThat(solution).isEqualTo(EXPECTED_MULTIPLY)
    }

    @Test
    internal fun `when numbers doesn't sum 2020 should return exception`() {
        val sumNumberPairFinder = SumNumberPairFinder(2020)
        val reportRepair = ReportRepair(sumNumberPairFinder)

        assertThrows<EntriesNotFound> { reportRepair(NUMBERS_NOT_SUMMING_2020) }
    }

    @Test
    internal fun `numbers inside a list sum 2020 then those numbers should be multiplied`() {
        val sumNumberPairFinder = SumNumberPairFinder(2020)
        val reportRepair = ReportRepair(sumNumberPairFinder)

        val solution = reportRepair(LIST_NUMBERS_SUMMING_2020)

        assertThat(solution).isEqualTo(EXPECTED_MULTIPLY)
    }

    private companion object {
        val NUMBERS_SUMMING_2020 = listOf(1000, 1020)
        val LIST_NUMBERS_SUMMING_2020 = listOf(1000, 73, 1020, 22, 104, 3000)
        val NUMBERS_NOT_SUMMING_2020 = listOf(1001, 1020)
        const val EXPECTED_MULTIPLY = 1020000
    }
}

