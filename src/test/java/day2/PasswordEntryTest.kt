package day2

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test
import org.junit.runners.Parameterized

class PasswordEntryTest {

    @Test
    internal fun `password containing numbers of chars specified by the policy is valid`() {
        val policy = Policy('a', 1, 3)

        assertTrue(PasswordEntry(policy, "abcde").isValid())
        assertTrue(PasswordEntry(policy, "abacade").isValid())
    }

    @Test
    internal fun `password containing fewer characters than specified by the policy is invalid`() {
        val password = "abcde"
        val policy = Policy('a', 2, 3)

        val passwordEntry = PasswordEntry(policy, password)

        assertFalse(passwordEntry.isValid())
    }

    @Test
    internal fun `password containing more characters than specified by the policy is invalid`() {
        val password = "aaaabcde"
        val policy = Policy('a', 2, 3)

        val passwordEntry = PasswordEntry(policy, password)

        assertFalse(passwordEntry.isValid())
    }

    @Test
    internal fun `password not containing the character specified by the policy is invalid`() {
        val password = "bcde"
        val policy = Policy('a', 2, 3)

        val passwordEntry = PasswordEntry(policy, password)

        assertFalse(passwordEntry.isValid())
    }
}