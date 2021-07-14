package day8.case

import day8.InstructionProcessor
import day8.OperationParser
import day8.OperationsFixer

class HandheldHaltingMain {
    fun exec() {
        val operations = OperationParser().parse(HandheldHaltingCase.case)
        val processor = InstructionProcessor()
        val operationsFixer = OperationsFixer(processor)

        println("DAY 8-1 : Accumulator when first loop starts: ${processor.process(operations).accumulator}")
        println("DAY 8-2 : Accumulator with fixed operations: ${operationsFixer.fix(operations)}")
    }
}