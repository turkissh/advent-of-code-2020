package day8

class OperationsFixer(private val processor: InstructionProcessor) {
    fun fix(operations: List<Operation>): Int {

        val result = processor.process(operations)

        if (result.isSuccessful) {
            return result.accumulator
        } else {

            val stackTrace = result.stackTrace
            for (instructionPointer in stackTrace) {

                val operationToFix = operations[instructionPointer]

                if (isAFixableOperation(operationToFix)) {
                    val fixedOperations = operations.toMutableList()
                    fixedOperations[instructionPointer] = fixOperation(operationToFix)

                    val fixedResult = processor.process(fixedOperations)

                    if (fixedResult.isSuccessful) {
                        return fixedResult.accumulator
                    }
                }
            }
        }

        return result.accumulator
    }

    private fun isAFixableOperation(operationToFix: Operation) = operationToFix !is AccumulateOperation

    private fun fixOperation(operation: Operation): Operation {
        return when (operation) {
            is NoOperation -> {
                JumpOperation(operation.argument)
            }
            is JumpOperation -> {
                NoOperation(operation.argument)
            }
            else -> {
                operation
            }
        }
    }
}