package day2

class PasswordEntryParser {
    fun parse(input: String): List<PasswordEntry> {
        return input.lines().map { parseLine(it) }
    }

    private fun parseLine(line: String): PasswordEntry {
        val splitedLine = line.trim().split(" ")

        val (min, max) = splitedLine[0].split("-").let { Pair(it[0].toInt(), it[1].toInt()) }
        val character = splitedLine[1][0]
        val password = splitedLine[2]

        return PasswordEntry(Policy(character, min, max), password)
    }
}