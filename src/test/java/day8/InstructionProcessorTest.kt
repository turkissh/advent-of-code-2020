package day8

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InstructionProcessorTest {

    @Test
    internal fun `process no operation`() {
        val operations = listOf<Operation>(NoOperation(0))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations).accumulator

        assertThat(accumulator).isEqualTo(initialAccumulator)
    }

    @Test
    internal fun `process accumulate operation`() {
        val operations = listOf<Operation>(AccumulateOperation(accumulatorArgument))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations).accumulator

        assertThat(accumulator).isEqualTo(accumulatorArgument)
    }

    @Test
    internal fun `process three operations in a row`() {
        val operations = listOf(NoOperation(0), AccumulateOperation(accumulatorArgument), AccumulateOperation(accumulatorArgument))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations).accumulator

        assertThat(accumulator).isEqualTo(accumulatorArgument + accumulatorArgument)
    }

    @Test
    internal fun `process jump forward operation`() {
        val anyAccumulateArgument = 1024
        val operations = listOf(
            NoOperation(0),
            JumpOperation(twoPositionsForward),
            AccumulateOperation(anyAccumulateArgument),
            AccumulateOperation(accumulatorArgument))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations).accumulator

        assertThat(accumulator).isEqualTo(accumulatorArgument)
    }

    @Test
    internal fun `process jump backward operation`() {
        val operations = listOf(
            JumpOperation(twoPositionsForward),
            JumpOperation(twoPositionsForward),
            JumpOperation(onePositionBackwards),
            AccumulateOperation(accumulatorArgument))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations).accumulator

        assertThat(accumulator).isEqualTo(accumulatorArgument)
    }

    @Test
    internal fun `returns accumulator value before executing one operation twice`() {
        val operations = listOf(
            AccumulateOperation(accumulatorArgument),
            JumpOperation(twoPositionsForward),
            AccumulateOperation(accumulatorArgument),
            AccumulateOperation(accumulatorArgument),
            JumpOperation(onePositionBackwards))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations).accumulator

        assertThat(accumulator).isEqualTo(accumulatorArgument + accumulatorArgument)
    }

    @Test
    internal fun `informs if process ended successfully`() {
        val operations = listOf(
            AccumulateOperation(accumulatorArgument),
            NoOperation(0))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations)

        assertThat(accumulator).isEqualTo(ProcessResult(true, ArrayDeque(listOf(1,0)), accumulatorArgument))
    }

    @Test
    internal fun `informs if process fails`() {
        val operations = listOf(
            NoOperation(0),
            AccumulateOperation(1),
            JumpOperation(4),
            AccumulateOperation(3),
            JumpOperation(-3),
            AccumulateOperation(-99),
            AccumulateOperation(1),
            JumpOperation(-4),
            AccumulateOperation(6))
        val expectedStacktrace = ArrayDeque(listOf(4,3,7,6,2,1,0))
        val processor = InstructionProcessor()

        val accumulator = processor.process(operations)

        assertThat(accumulator).isEqualTo(ProcessResult(false, expectedStacktrace, accumulatorArgument))
    }

    private companion object {
        const val initialAccumulator = 0
        const val accumulatorArgument = 5
        const val twoPositionsForward = 2
        const val onePositionBackwards = -1
    }
}