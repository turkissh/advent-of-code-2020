package day2

data class CharacterCountPolicy(private val char: Char, private val min: Int, private val max: Int) : Policy {
    override fun validates(password: String): Boolean {
        val charCount = password.count { it == char }
        return (min..max).contains(charCount)
    }
}