package day2

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test

internal class CharacterInPositionPolicyTest {

    @Test
    internal fun `validates password if contains the character in any specified positions`() {
        val policy = CharacterInPositionPolicy('a', 1, 3)

        assertTrue(policy.validates("abcde"))
        assertTrue(policy.validates("zbacode"))
    }

    @Test
    internal fun `validates password if contains the character only once in specified positions`() {
        val policy = CharacterInPositionPolicy('a', 1, 3)

        assertFalse(policy.validates("abade"))
    }

    @Test
    internal fun `does not validates password if not contains the character in any specified positions`() {
        val policy = CharacterInPositionPolicy('a', 1, 3)

        assertFalse(policy.validates("xbxda"))
    }
}