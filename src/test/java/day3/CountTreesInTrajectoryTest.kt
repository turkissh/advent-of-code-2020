package day3

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class CountTreesInTrajectoryTest {

    private val trajectory = Trajectory()

    @Test
    internal fun `returns one if there is a tree in initial position`() {
        val count = givenACounter()
        val map: Map = givenAMapWithATreeAtInitialPosition()

        val treesCount = count(map, trajectory)

        assertThat(treesCount).isEqualTo(1)
    }

    @Test
    internal fun `returns zero if there is no tree in initial position`() {
        val count = givenACounter()
        val map: Map = givenAMapWithoutATreeAtInitialPosition()

        val treesCount = count(map, trajectory)

        assertThat(treesCount).isEqualTo(0)
    }

    @Test
    internal fun `returns the number of trees in the trajectory`() {
        val count = givenACounter()
        val map = givenAMapWithTreesInTwoPositions()

        val treesCount = count(map, trajectory)

        assertThat(treesCount).isEqualTo(2)
    }

    @Test
    internal fun `counts trees until reach the bottom`() {
        val count = givenACounter()
        val map: Map = givenAMapWithFivePositions()

        val treesCount = count(map, trajectory)

        assertThat(treesCount).isEqualTo(3)
    }

    private fun givenACounter(): CountTreesInTrajectory {
        return CountTreesInTrajectory()
    }

    private fun givenAMapWithTreesInTwoPositions(): Map {
        val map: Map = mock {}
        whenever(map.hasATreeAt(Position(1, 1))).thenReturn(true)
        whenever(map.hasATreeAt(Position(2, 4))).thenReturn(false)
        whenever(map.hasATreeAt(Position(3, 7))).thenReturn(true)
        whenever(map.isInvalidPosition(Position(4, 10))).thenReturn(true)
        return map
    }

    private fun givenAMapWithATreeAtInitialPosition(): Map {
        val map: Map = mock {}
        whenever(map.hasATreeAt(Position(1, 1))).thenReturn(true)
        whenever(map.isInvalidPosition(Position(2, 4))).thenReturn(true)
        return map
    }

    private fun givenAMapWithoutATreeAtInitialPosition(): Map {
        val map: Map = mock {}
        whenever(map.hasATreeAt(Position(1, 1))).thenReturn(false)
        whenever(map.isInvalidPosition(Position(2, 4))).thenReturn(true)
        return map
    }

    private fun givenAMapWithFivePositions(): Map {
        val map: Map = mock {}
        whenever(map.hasATreeAt(Position(1, 1))).thenReturn(true)
        whenever(map.hasATreeAt(Position(2, 4))).thenReturn(false)
        whenever(map.hasATreeAt(Position(3, 7))).thenReturn(true)
        whenever(map.hasATreeAt(Position(4, 10))).thenReturn(false)
        whenever(map.hasATreeAt(Position(5, 13))).thenReturn(true)
        whenever(map.isInvalidPosition(Position(6, 16))).thenReturn(true)
        return map
    }
}
