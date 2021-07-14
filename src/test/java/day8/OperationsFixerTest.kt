package day8

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperationsFixerTest {

    @Test
    internal fun `does not fix operations without a loop`() {
        val operations = listOf(
            AccumulateOperation(5),
            NoOperation(0)
        )
        val processor = InstructionProcessor()
        val fixer = OperationsFixer(processor)

        val accumulator = fixer.fix(operations)

        assertThat(accumulator).isEqualTo(5)
    }

    @Test
    internal fun `fix operations when loop is detected`() {
        val operations = listOf(
            NoOperation(0),
            AccumulateOperation(1),
            JumpOperation(4),
            AccumulateOperation(3),
            JumpOperation(-3),
            AccumulateOperation(-99),
            AccumulateOperation(1),
            JumpOperation(-4),
            AccumulateOperation(6)
        )
        val processor = InstructionProcessor()
        val fixer = OperationsFixer(processor)

        val accumulator = fixer.fix(operations)

        assertThat(accumulator).isEqualTo(8)
    }
}

