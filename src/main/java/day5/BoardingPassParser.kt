package day5

class BoardingPassParser {
    fun parse(input: String): List<BoardingPass> = input.lines().map { BoardingPass(it.trim()) }
}