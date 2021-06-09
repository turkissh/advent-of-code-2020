package day5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MissingSeatFinderTest {

    @Test
    internal fun test() {
        //row * 8 + column
        //primer id: 1 * 8 + 0 = 8
        //ultimo id: 126 * 8 + 7 = 1015

        val allIds = (8..1015)
        val expectedMissingId = 400

        val case = allIds.filterNot { it == expectedMissingId }.shuffled()

        val missingSeatFinder = MissingSeatFinder()

        val missingId = missingSeatFinder.find(case)

        assertThat(missingId).isEqualTo(expectedMissingId)
    }
}

