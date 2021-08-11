package day9

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class XmasWeaknessFinderTest {

    @Test
    internal fun `third number is the sum of the first two`() {
        val numbers = listOf(1, 2, 3).map { it.toBigInteger() }
        val preambleSize = 2
        val xmasWeaknessFinder = XmasWeaknessFinder()

        val weaknessNumber = xmasWeaknessFinder.find(numbers, preambleSize)

        assertThat(weaknessNumber).isNull()
    }

    @Test
    internal fun `third number is not the sum of the first two`() {
        val numbers = listOf(1, 2, 7).map { it.toBigInteger() }
        val preambleSize = 2
        val xmasWeaknessFinder = XmasWeaknessFinder()

        val weaknessNumber = xmasWeaknessFinder.find(numbers, preambleSize)

        assertThat(weaknessNumber).isEqualTo(7)
    }

    @Test
    internal fun `next number is evaluated until weakness is found`() {
        val numbers = listOf(1, 2, 3, 7).map { it.toBigInteger() }
        val preambleSize = 2
        val xmasWeaknessFinder = XmasWeaknessFinder()

        val weaknessNumber = xmasWeaknessFinder.find(numbers, preambleSize)

        assertThat(weaknessNumber).isEqualTo(7)
    }

    @Test
    internal fun `number list has no weaknesses`() {
        val numbers = listOf(1, 2, 3, 5).map { it.toBigInteger() }
        val preambleSize = 2
        val xmasWeaknessFinder = XmasWeaknessFinder()

        val weaknessNumber = xmasWeaknessFinder.find(numbers, preambleSize)

        assertThat(weaknessNumber).isNull()
    }
}

