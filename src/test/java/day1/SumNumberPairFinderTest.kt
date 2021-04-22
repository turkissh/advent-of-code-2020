package day1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SumNumberPairFinderTest {

    @Test
    internal fun `two numbers sum target should be returned`() {
        val numbers = listOf(1000,500,2500,300)
        val sumNumberPairFinder = SumNumberPairFinder(TARGET)

        val matchingPair = sumNumberPairFinder(numbers)

        assertThat(matchingPair.toList()).containsOnly(1000,500)
    }

    @Test
    internal fun `if no matchers are found should return exception`() {
        val numbers = listOf(300,500)
        val sumNumberPairFinder = SumNumberPairFinder(TARGET)

        assertThrows<NumberNotMatchingException> { sumNumberPairFinder(numbers) }
    }

    private companion object {
        const val TARGET = 1500
    }
}

