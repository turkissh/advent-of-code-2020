package day3

import javafx.geometry.Pos
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Integer.max
import java.lang.Integer.min
import java.lang.RuntimeException

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

    private companion object {
        const val patternHeight = 3
        const val patternWidth = 3
        val positionsWithTree = setOf(Position(1, 1), Position(2, 2), Position(2, 3))
        val positionsWithoutTree = setOf(Position(2, 1), Position(3, 3))
    }
}

class InvalidPosition : RuntimeException()

class Map(private val pattern: Pattern) {
    fun hasATreeAt(position: Position): Boolean {
        if (position.row > pattern.height) {
            throw InvalidPosition()
        }

        val fixedPosition = calculateFixedPosition(position)

        return pattern.trees.contains(fixedPosition)
    }

    private fun calculateFixedPosition(position: Position): Position {
        val newColumn = if (position.column.rem(pattern.width) == 0) {
            pattern.width
        } else {
            position.column.rem(pattern.width)
        }

        return Position(position.row, newColumn)
    }
}

data class Pattern(val height: Int, val width: Int, val trees: Set<Position>)