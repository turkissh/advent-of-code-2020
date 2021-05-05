package day2

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test

class CharacterCountPolicyTest {

    @Test
    internal fun `validates password if number of char appearances is between min and max`() {
        val policy = CharacterCountPolicy('a', 1, 3)

        assertTrue(policy.validates("abcde"))
        assertTrue(policy.validates("abacade"))
    }

    @Test
    internal fun `password is invalid if contains fewer characters than min`() {
        val password = "abcde"
        val policy = CharacterCountPolicy('a', 2, 3)

        assertFalse(policy.validates(password))
    }

    @Test
    internal fun `password is invalid if contains more characters than max`() {
        val password = "aaaabcde"
        val policy = CharacterCountPolicy('a', 2, 3)

        assertFalse(policy.validates(password))
    }

    @Test
    internal fun `password is invalid if not contains the character`() {
        val password = "bcde"
        val policy = CharacterCountPolicy('a', 2, 3)

        assertFalse(policy.validates(password))
    }
}