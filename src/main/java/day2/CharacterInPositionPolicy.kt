package day2

class CharacterInPositionPolicy(private val character: Char, private val firstPosition: Int, private val secondPosition: Int) : Policy {
    override fun validates(password: String): Boolean {
        val isInFirstPosition = isCharacterInPosition(password, firstPosition)
        val isInSecondPosition = isCharacterInPosition(password, secondPosition)
        return isPresentOnlyOnce(isInFirstPosition, isInSecondPosition)
    }

    private fun isCharacterInPosition(password: String, position: Int) = password[position - 1] == character

    private fun isPresentOnlyOnce(isInFirstPosition: Boolean, isInSecondPosition: Boolean) = isInFirstPosition.xor(isInSecondPosition)
}