package day3

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TrajectoryTest {

    @Test
    internal fun `initial position is upper left corner`() {
        val trajectory = Trajectory()

        val currentPosition = trajectory.currentPosition()

        assertThat(currentPosition).isEqualTo(upperLeftCorner)
    }

    @Test
    internal fun `when slides updates its position`() {
        val trajectory = Trajectory()

        trajectory.slide()

        assertThat(trajectory.currentPosition()).isEqualTo(expectedNewPosition)
    }

    private companion object {
        val upperLeftCorner = Position(1, 1)
        val expectedNewPosition = Position(2, 4)
    }
}

data class Position(val row: Int, val column: Int)

class Trajectory {

    private var position = initialPosition

    fun currentPosition(): Position {
        return position
    }

    fun slide() {
        position = Position(position.row + rowSlide, position.column + columnSlide)
    }

    private companion object {
        const val rowSlide = 1
        const val columnSlide = 3
        val initialPosition = Position(1, 1)
    }
}
