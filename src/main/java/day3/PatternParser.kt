package day3

class PatternParser {
    fun parse(rawPattern: String): Pattern {
        val lines = rawPattern.trim().lines()
        val height = lines.count()
        val width = lines[0].length

        val positions = mutableSetOf<Position>()
        lines.mapIndexed { rowIndex, row ->
            row.trim().mapIndexedNotNull { colIndex, char ->
                if (char == '#') {
                    Position(rowIndex + 1, colIndex + 1)
                } else {
                    null
                }
            }
        }.forEach { listOfPositions ->
            positions.addAll(listOfPositions)
        }

        return Pattern(height, width, positions)
    }
}