package day2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountValidPasswordsTest {

    @Test
    internal fun `a valid password should count one`() {
        val passwordEntry = PasswordEntry(CharacterCountPolicy('a', 1, 3), "abcde")
        val countValidPasswords = CountValidPasswords()

        val count = countValidPasswords(listOf(passwordEntry))

        assertThat(count).isEqualTo(1)
    }

    @Test
    internal fun `invalid entry should count zero`() {
        val passwordEntry = PasswordEntry(CharacterCountPolicy('z', 1, 3), "abcde")
        val countValidPasswords = CountValidPasswords()

        val count = countValidPasswords(listOf(passwordEntry))

        assertThat(count).isEqualTo(0)
    }

    @Test
    internal fun `should not count invalid entries`() {
        val policy = CharacterCountPolicy('z', 1, 3)
        val passwordEntries = listOf(
            PasswordEntry(policy, "abcdez"),
            PasswordEntry(policy, "abcde"),
            PasswordEntry(policy, "azbczdez"),
            PasswordEntry(policy, "azbczdezz")
        )

        val countValidPasswords = CountValidPasswords()
        val count = countValidPasswords(passwordEntries)

        assertThat(count).isEqualTo(2)
    }
}

