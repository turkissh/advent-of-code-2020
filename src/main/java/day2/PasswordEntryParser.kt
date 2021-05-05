package day2

import day2.policies.PolicyFactory

class PasswordEntryParser {
    fun parse(input: String, policyFactory: PolicyFactory): List<PasswordEntry> {
        return input.lines().map { parseLine(it, policyFactory) }
    }

    private fun parseLine(line: String, policyFactory: PolicyFactory): PasswordEntry {
        val splitedLine = line.trim().split(" ")

        val (min, max) = splitedLine[0].split("-").let { Pair(it[0].toInt(), it[1].toInt()) }
        val character = splitedLine[1][0]
        val password = splitedLine[2]

        return PasswordEntry(policyFactory.create(character, min, max), password)
    }
}