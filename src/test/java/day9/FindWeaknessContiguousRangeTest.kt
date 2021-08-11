package day9

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigInteger

class FindWeaknessContiguousRangeTest {

    @Test
    internal fun `Contiguous numbers that sum the weakness number`() {
        val numbers = listOf(1, 2, 8, 7, 10).toBigIntegerList()
        val weaknessNumber = BigInteger("10")

        val findWeaknessContiguousRange = FindWeaknessContiguousRange()
        val weaknessContiguousRange = findWeaknessContiguousRange(numbers, weaknessNumber)

        assertThat(weaknessContiguousRange).containsExactlyInAnyOrderElementsOf(listOf(2, 8).toBigIntegerList())
    }

    @Test
    internal fun `Contiguous numbers that sum the weakness number PART 2`() {
        val numbers = listOf(35, 20, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576).toBigIntegerList()
        val weaknessNumber = BigInteger("127")

        val findWeaknessContiguousRange = FindWeaknessContiguousRange()
        val weaknessContiguousRange = findWeaknessContiguousRange(numbers, weaknessNumber)

        assertThat(weaknessContiguousRange).containsExactlyInAnyOrderElementsOf(listOf(15, 25, 47, 40).toBigIntegerList())
    }

}

fun List<Int>.toBigIntegerList() = this.map { it.toBigInteger() }