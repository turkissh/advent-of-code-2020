package day3

 import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class MapTest {

    @Test
    internal fun `given a position returns if there is a tree`() {
        //# . .
        //. # #
        //. . .
        val pattern = Pattern(patternHeight, patternWidth, positionsWithTree)
        val map = Map(pattern)

        positionsWithTree.forEach { assertTrue(map.hasATreeAt(it)) }
        positionsWithoutTree.forEach { assertFalse(map.hasATreeAt(it)) }
    }

    @Test
    internal fun `cannot request positions below lower boundary`() {
        //# . .
        //. # #
        //. . .
        val pattern = Pattern(patternHeight, patternWidth, positionsWithTree)
        val map = Map(pattern)

        assertThrows<InvalidPosition> { map.hasATreeAt(Position(patternHeight + 1, 1)) }
    }

    @Test
    internal fun `given a position outside the pattern return if there is a tree`() {
        //# . . # . .
        //. # # . # #
        //. . . . . .
        val pattern = Pattern(patternHeight, patternWidth, positionsWithTree)
        val map = Map(pattern)

        assertTrue(map.hasATreeAt(Position(1, 4)))
        assertTrue(map.hasATreeAt(Position(2, 5)))
        assertTrue(map.hasATreeAt(Position(2, 6)))
        assertTrue(map.hasATreeAt(Position(2, 8)))
        assertTrue(map.hasATreeAt(Position(2, 3)))
        assertFalse(map.hasATreeAt(Position(3, 4)))
    }

    @Test
    internal fun `position below the bottom is invalid`() {
        val pattern = Pattern(patternHeight, patternWidth, positionsWithTree)
        val map = Map(pattern)

        assertFalse(map.isInvalidPosition(Position(2,2)))
        assertTrue(map.isInvalidPosition(Position(4,1)))
    }

    private companion object {
        const val patternHeight = 3
        const val patternWidth = 3
        val positionsWithTree = setOf(Position(1, 1), Position(2, 2), Position(2, 3))
        val positionsWithoutTree = setOf(Position(2, 1), Position(3, 3))
    }
}

