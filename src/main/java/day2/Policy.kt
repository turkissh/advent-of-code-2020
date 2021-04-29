package day2

data class Policy(private val char: Char, private val min: Int, private val max: Int) {
    fun validates(password: String): Boolean {
        val charCount = password.count { it == char }
        return (min..max).contains(charCount)
    }
}