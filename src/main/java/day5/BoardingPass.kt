package day5

data class BoardingPass(private val boardingPassCode: String) {
    val rowCode: String = boardingPassCode.substring(0, 7)
    val columnCode = boardingPassCode.substring(7, 10)

    companion object {
        const val rowCount = 128
        const val columnCount = 8
        const val lowerHalfRowCharacter = 'F'
        const val lowerHalfColumnCharacter = 'L'
    }
}