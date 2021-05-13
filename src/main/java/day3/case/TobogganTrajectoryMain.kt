package day3.case

import day3.CountTreesInTrajectory
import day3.Map
import day3.PatternParser
import day3.Trajectory

class TobogganTrajectoryMain {
    fun exec() {
        val pattern = PatternParser().parse(TobogganTrajectoryCase.case)
        val countTrees = CountTreesInTrajectory()
        val map = Map(pattern)

        val treeCount = countTrees(map, Trajectory())

        println("DAY 3-1 : Number of trees: $treeCount")

        val slopesMultipliedTrees = listOf(
            Trajectory(1, 1),
            Trajectory(1, 3),
            Trajectory(1, 5),
            Trajectory(1, 7),
            Trajectory(2, 1)
        )
            .map { countTrees(map, it).toLong() }
            .fold(1L, { acc, i -> acc * i })

        println("DAY 3-2 : Number multiplied slopes trees: $slopesMultipliedTrees")
    }
}