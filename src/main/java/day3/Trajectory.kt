package day3

class Trajectory(private val rowSlide: Int = defaultRowSlide, private val columnSlide: Int = defaultColumnSlide) {

    private var position = initialPosition

    fun currentPosition(): Position {
        return position
    }

    fun slide() {
        position = Position(position.row + rowSlide, position.column + columnSlide)
    }

    private companion object {
        const val defaultRowSlide = 1
        const val defaultColumnSlide = 3
        val initialPosition = Position(1, 1)
    }
}