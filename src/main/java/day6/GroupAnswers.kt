package day6

data class GroupAnswers(private val answers: List<String>) {
    val numberOfRepeatedQuestions: Int
        get() {
            return answers.fold(('a'..'z').toSet(), { acc, element -> acc.intersect(element.toSet()) }).size
        }
    val numberOfDifferentQuestions: Int
        get() {
            val questions = mutableSetOf<Char>()
            answers.forEach { questions.addAll(it.toList()) }
            return questions.size
        }
}