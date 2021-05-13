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