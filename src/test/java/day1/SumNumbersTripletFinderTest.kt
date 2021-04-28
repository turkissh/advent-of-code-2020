package day1

import day1.exceptions.EntriesNotFound
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SumNumbersTripletFinderTest {

    @Test
    internal fun `three numbers sum target should be returned`() {
        val numbers = listOf(979, 366, 675, 222)
        val sumNumberFinder = SumNumbersTripletFinder(TARGET)

        val matchingNumbers = sumNumberFinder(numbers)

        assertThat(matchingNumbers).containsOnly(979, 366, 675)
    }

    @Test
    internal fun `if no matchers are found should return exception`() {
        val numbers = listOf(979, 366, 674)
        val sumNumberFinder = SumNumbersTripletFinder(TARGET)

        assertThrows<EntriesNotFound> { sumNumberFinder(numbers) }
    }

    @Test
    internal fun `numbers must be different`() {
        val numbers = listOf(111, 100, 400)
        val sumNumberFinder = SumNumbersTripletFinder(333)

        assertThrows<EntriesNotFound> { sumNumberFinder(numbers) }
    }

    private companion object {
        const val TARGET = 2020
    }

}

