package day3.case

class TobogganTrajectoryCase {
    companion object {
        val case = """
            .........#....#.###.........##.
            ..###.#......#......#.......##.
            ##....#.#.......#.....#........
            #........#..........#.#...#...#
            #....###...##.....#........#...
            ###..............##..#.....#...
            .................##.#..........
            .........##......#..###.....#.#
            ..#..#...#.#.#...#.#.#.##...#..
            ..............#.#.#..#..#..#...
            .#.#.#....#.........#.........#
            ..#.#....##..#...#.....#..##..#
            ............#.....#.........##.
            ...#.#..#..........#.##.....#..
            #......#...##.......###........
            .....#....#.#..............#...
            .....#.......#..##.###.....#.#.
            .#.....#....##.#......##......#
            ..##...##.........#..#.#..#....
            ............#.......#.....#....
            .......................#...####
            .#.#.......#..#....#....##..#.#
            ..#.##.#.#...............#.....
            #..##..#...#.....##..#...##.#..
            ##...#....#####.....##...#...##
            .#..##..#..#.#..##.#.#........#
            ....#..#........##......#.#....
            ..#......#...##.#..##.......#..
            .#.#....#.#..#.....#..#...#....
            .....#.#.................#.....
            ##.#........#.....#...........#
            #............#.....#..#.#...##.
            ..#.#..#......#.......#......##
            ....#.#....#...#....#..........
            .........#...#.##..#...#...#...
            ....#...#...#..................
            ..##...#.#....#...#......#.....
            #....#.......##..#...#..#......
            .#....##..#.#....#...##...#....
            #.................#...#.#...#..
            .#.....#..........#.......#....
            .#..........#.##....#.##......#
            #.#.....##.##..#.......#..#....
            .....#...#............#..##....
            ...#.#.##.#..........#.#....#..
            .......#...#............#.....#
            ..........#...##..#....###....#
            ............#....#......###....
            ...................####..#.##..
            ...#.#.##.........#..#.#.......
            ...........#.........#..###....
            .........#.........#...#...###.
            .#.#.##....#.#...........#.#...
            ..###.....#...#.#.......##..#..
            .....#.#........#.#....#....##.
            ......#...#........#.........#.
            ...............#.........#.#...
            ..#...#...#...#.###..###....#..
            #..#.......#..###.##.......#...
            #.#.........##..#.....###..#..#
            ...#....#....#.#..#............
            ..###..##....................#.
            ..#.......#..........#.##......
            ..##........#...###..##.#......
            ......#.#...#.....#..##..#.....
            #........#......#..............
            ........#........#.......#....#
            .....#.......#......#........##
            #.#......#.#...##.#.......#....
            #...................##...#.....
            ..#.#...#..#...#..#.....#..#...
            .......##..................##..
            .............#..##.#......##..#
            ###...........##.#....###..#...
            .#..........##...#..#......#...
            ..#.###.#....#........#........
            ....#....###.....#.......#.....
            .....##....#..##...#..#........
            .##...#..#....#..#.........#...
            #.........##....#..##..##......
            .#.#.............#.....##......
            ..#.#............#.......##.#..
            ..#.##..#.........#......#.#.#.
            .#...#...#..#....#...#....#.#.#
            ....#...#..#.##..##.......##...
            .#.....#.....#............#....
            ..........#....#..#..#......#..
            .............#....#..#.........
            ....#.#.#.......#....#.#.......
            ..##....#.#....#...#........###
            #...#..........#..........###..
            ...#..#...#...#..##......#...#.
            .....................#...#..#.#
            #..#............#.........#.##.
            ..#...#...........#.......#....
            .....##..........#...##.....##.
            .#.....#.#........##...........
            ..#....#..#.#..##...#.........#
            .........#.###.##....#..###....
            .........#...##...##.#.#....##.
            ...#..##.#...........#....#....
            ..........#.#...........##.....
            ...........#..........#...##...
            .........#..........#...#.#...#
            ......#..#.................#...
            .....#...........#..#...#..###.
            .....#..#....#.#.##...##....##.
            ...##.###.#.#..#.#....##.#.#...
            ###.....#.....#........#...#...
            .#....#........#.#....#..#...##
            ##.....#.....#......#.#..#...##
            .##....#...............#.......
            #.#.....#.#....#.........#.....
            ..#...............#.......##...
            #...#.###..#....#.#.#..#.#.....
            ##.###....##...#....#.....#....
            .......#................##.....
            ....#....##..#....#..#......#..
            ...#.........#...#........##.##
            .#..............#..............
            ..##.......#.###..##.#.........
            ..#...#...#...#...#...#.....##.
            .....#..##...#.....##..#.#.....
            ..#.............#...#.........#
            #.........................#..##
            .............#..###........#...
            ......#..#....#.##.......#..#..
            ...#..#..#...#....#..#...##...#
            .##............#.......###.#...
            .#........#..#.................
            #.#.#.....##....##...#.....#.#.
            ...##.......#.#......#...#.#...
            #.##....#.........#.....##...#.
            #...#..#....#.......#.##...##..
            .................##.#..##.#.#.#
            ..#.............#.......#.#.##.
            #....##..................#...##
            ..........#.......#..##........
            ......#.#..#......#.#.........#
            #.#........#####......#.#.#....
            #..#........#.#..#.....#.......
            ...#.............#.............
            .....#.......#......#..#.##..#.
            ..#.........#..........#.##...#
            #.....#.#####......#.......###.
            .......#.....#...#.....#.#..#..
            #...#.#........#.#..#..#...#..#
            ...#....#....##.....#..........
            .#.......##.......##...........
            ...#.##.#.#..#....#...##....##.
            .#...#...#.........#...........
            .#.#.##..#.......#.#...#..#....
            .#....##.#.#...#......#......#.
            ##..#..#..#..#.......#......#..
            .........#.#...........#....#.#
            ........#....#.#...#.#..#......
            #.......#.#.................##.
            .....#..#..#....#.#........#.##
            .#..###..#....#..#........#.#..
            #...........#...#........#.....
            ........#..#.#.#.#.......#....#
            ....#..#..........#.#..#.....#.
            ..####..........#..............
            ....###.#..#........##..#......
            .#..#......##..........#...#...
            .#.....#....#......##.##...#.##
            ..##.#.#......#.......##.......
            ....##.......#..............#..
            ........#.....##..............#
            .#...#....##.....#....#.......#
            ....#.......###.......#.#.#....
            ##.....##........#.....##......
            ..........#.....#...##.#..#.#..
            ..........#.#......#..........#
            ..........#...#..#...#...#.....
            .#.......#..##.................
            .#........##..............#..#.
            .##...................#...#....
            .##....#.##.##........#........
            ...##.....####.....#..#.......#
            ...##.#...##...#.##............
            ##.......#.....###..#..#...##..
            #.####...#...#...##..#..#....#.
            ...#........##........#........
            #....#.#....##..#..#.##...#....
            ...##....##....#.......#..###..
            ..........#..#..........#..#.#.
            #..#....#.......#.......#....#.
            ......#......#.....##..##.#..#.
            ##.#.....#....#.......#...#...#
            ..##..#.#...#...#.....###..##..
            ....#..#.......#............##.
            #..##.#.#.....#####....#....#..
            .#........#...#.#..##.#.####.#.
            #...#...#.............#.#......
            .........#.....##..........#...
            .##....#....#........#......#.#
            #..###...#....#..........#.....
            .#...##.........#..#..#.#...#..
            #.#.#.......................#..
            #.....#..#.#............###....
            #...#.....#.....###..#..#.#.##.
            ............#.........#.#.##...
            ...#.......###......##......#..
            .#....#.#....##......##.#...#..
            .........#.......#....#...##..#
            ................#.#.....#....#.
            .##......#....#..#..###..#...#.
            ....##....#..#....#.##..#......
            .......#.#.....#..#............
            ..........#....#....#..#..#....
            ..#....#.....#.......#.........
            ......#.........#.##..#....##.#
            ..#..#.#.......##..#...##......
            ...##..#.#.#...............##..
            ..#.#.#......#....#.....#.##...
            ..#.....#.#...........#....##..
            ###.....##.....................
            .......#..#.................#..
            .#.#..#..#.........#......#...#
            ##.......#.##.......#..........
            #..#.....#.....#.....#.......#.
            #..#.....#.....#..........#.#..
            .#....##....#.....#.......#.##.
            .....#.#......##..##.#.........
            #....##......#..#....#..##..#..
            #.##..#..#..............#...#..
            .#......#......#..#...........#
            ..#.......#........#....#..#...
            .....##.#.......##....#.#....#.
            ........#....................#.
            ........#..#..........#........
            ......#.#.....#.#.....#......#.
            #......##......###.##......#...
            ...........###..#...#.......#..
            ..#...###...#.....#....#...#..#
            .....##......#.#......##..#.#..
            #.#......##...#.....##...#...#.
            .#.#........#.......#.........#
            ....#....#...##..........#.#...
            .#..##.#...#.#.....##......##..
            .#.....#..##....#....#....#..#.
            ..#.......#.#.#..........#..#..
            #.#..#....#.##....#.......#....
            ........##.........#..#.#......
            .......#.....#.##..##......#.#.
            .........................#.#.#.
            ..#..............##.........#..
            .......###.#.#.......#.........
            #........#.....#.......#..#...#
            ##....#..#....#...........#....
            ..#..#.#.#.....#.#..#....#.....
            .#..##....#.##..#..............
            ...#....##..#..#.##....#.#.....
            ...##....#......##..#........#.
            ....#......#....#....#........#
            ...#..#...#.#...........#..#..#
            ....#.#.#.........#...#...#....
            ..........#....#......##....#.#
            ..##..#...##.#...###.#.##......
            #........#.##......##.#........
            ..#...#.##...#..........#.#...#
            ...........#...........#.......
            ......###....#..###..##........
            ...#........#..#.#.............
            ....#.#.....#.#............#..#
            ##.#.....#........#....##.....#
            .......#.#...#..##.......#.#.#.
            #......##..#..#...#.....#..#.#.
            .#......###.....#..#.....#...#.
            ....#.#.............#.##.......
            ......#....#.....#.......#..#..
            #..#.#.#..#......#...#..#.#....
            #..............#.#....#...#....
            ..#......#...##.#......#..#..#.
            .......##..#.##..#.#...#.....##
            .....#...........#....#.......#
            .#.........#..#..........##....
            #..##..#.#......##.......#..#..
            ...#....#...........##.#.#.#..#
            #..#..#..#...........#....#.#.#
            .....##......#......#.#...#....
            .....#..##....###.....#....##..
            ........#...##......#.....#..#.
            ..#.#..#.#....#...#.......#....
            #.....#...#.....#.#.......#....
            ......#...#.......#..##....#...
            #............#.....#....#......
            ..##...#.....#..#......#...#...
            ...#..#...#..#.......#........#
            ...##.#.#........#........#....
            #.#..#......##.#..#..#......#..
            #.......#..#...................
            #.....#....#......#...........#
            .##.#...#.#...#..............##
            ...###........#........#..##.#.
            ..##....#.#.#.##..#.#......#...
            ..#.#........#..............#..
            .......#.................##....
            ..................#............
            ....#.....#.#..............#.##
            ......#.....#..#......#...#....
            ..#....##......#...####....#.#.
            ..........#...##...........##.#
            ...#.#..#....#......#..#....#..
            #.........###...#.....#..#....#
            .#.#......##.#.....#...........
            ...............#.#....##..#..#.
            ..........#.#.#.#...#....##...#
            ...#....##.................##..
            #..##..#...##.##.#......#.#.###
            #..#...#..#.....#...#.#..##...#
            ..#................#...##....#.
            ...#.....#.##.......##....#.#..
            ....#.....#..#....##...........
            ...............#..........#....
            ....#...#........##...#........
            ...#....#...#.###..............
            #.#....#.......#..#.##.##......
            .#.....#..#..#......#....#.#...
            ...#..........................#
            ............#.#..#.##......#...
            .....#..........#.#........#.#.
        """.trimIndent()
    }
}