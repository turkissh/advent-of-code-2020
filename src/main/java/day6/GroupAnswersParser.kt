package day6

import java.util.regex.Pattern

class GroupAnswersParser {
    private val blankLinePattern = Pattern.compile("\\n\\n")

    fun parse(input: String): List<day6.GroupAnswers> {
        val rawGroupAnswers = input.trim().split(blankLinePattern)
        return rawGroupAnswers.map { day6.GroupAnswers(it.lines()) }
    }
}