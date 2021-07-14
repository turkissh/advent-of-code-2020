package day8

class OperationParser {
    fun parse(input: String): List<Operation> {
        return input.lines().mapNotNull { currentLine ->
            parseASingleLine(currentLine.trim())
        }
    }

    private fun parseASingleLine(input: String): Operation? {
        val operationName = input.split(" ")[0]
        val operationArgument = input.split(" ")[1].toInt()

        return when (operationName) {
            "acc" -> AccumulateOperation(operationArgument)
            "jmp" -> JumpOperation(operationArgument)
            "nop" -> NoOperation(operationArgument)
            else -> null
        }
    }
}