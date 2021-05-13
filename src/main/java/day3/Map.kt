package day3

open class Map(private val pattern: Pattern) {
    fun hasATreeAt(position: Position): Boolean {
        if (isInvalidPosition(position)) {
            throw InvalidPosition()
        }

        val fixedPosition = calculateFixedPosition(position)

        return pattern.trees.contains(fixedPosition)
    }

    fun isInvalidPosition(currentPosition: Position): Boolean = currentPosition.row > pattern.height

    private fun calculateFixedPosition(position: Position): Position {
        val newColumn = if (position.column.rem(pattern.width) == 0) {
            pattern.width
        } else {
            position.column.rem(pattern.width)
        }

        return Position(position.row, newColumn)
    }
}