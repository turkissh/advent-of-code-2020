package day3

class CountTreesInTrajectory {

    operator fun invoke(map: Map, trajectory: Trajectory): Int {
        var treesCount = 0

        while (!hasReachTheEnd(map, trajectory)) {
            treesCount += countTreeAtCurrentPosition(map, trajectory)
            trajectory.slide()
        }

        return treesCount
    }

    private fun countTreeAtCurrentPosition(map: Map, trajectory: Trajectory) = if (map.hasATreeAt(trajectory.currentPosition())) 1 else 0

    private fun hasReachTheEnd(map: Map, trajectory: Trajectory) = map.isInvalidPosition(trajectory.currentPosition())
}