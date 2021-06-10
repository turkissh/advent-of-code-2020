package day6

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupAnswersTest {

    @Test
    internal fun `return different questions from a single answer`() {
        val answers = GroupAnswers(listOf("abc"))

        assertThat(answers.numberOfDifferentQuestions).isEqualTo(3)
    }

    @Test
    internal fun `repeated questions from different answers are not counted`() {
        val answers = GroupAnswers(listOf("abc","bxd"))
        val allRepeatedAnswers = GroupAnswers(listOf("a","a","a","a","a"))

        assertThat(answers.numberOfDifferentQuestions).isEqualTo(5)
        assertThat(allRepeatedAnswers.numberOfDifferentQuestions).isEqualTo(1)
    }

    @Test
    internal fun `return number of questions answered by everyone`() {
        val answers = GroupAnswers(listOf("abc","bxd","abz"))
        assertThat(answers.numberOfRepeatedQuestions).isEqualTo(1)
    }
}