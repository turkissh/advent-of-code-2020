package day8

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperationsParserTest {

    @Test
    internal fun `parse one accumulate operation`() {
        val parser = OperationParser()
        val expectedOperations = listOf<Operation>(AccumulateOperation(13))

        val parseResult = parser.parse("acc +13")

        assertThat(parseResult).isEqualTo(expectedOperations)
    }

    @Test
    internal fun `parse one jump operation`() {
        val parser = OperationParser()
        val expectedOperations = listOf<Operation>(JumpOperation(-2))

        val parseResult = parser.parse("jmp -2")

        assertThat(parseResult).isEqualTo(expectedOperations)
    }

    @Test
    internal fun `parse one no operation`() {
        val parser = OperationParser()
        val expectedOperations = listOf<Operation>(NoOperation(139))

        val parseResult = parser.parse("nop +139")

        assertThat(parseResult).isEqualTo(expectedOperations)
    }

    @Test
    internal fun `parse multiple operations`() {
        val parser = OperationParser()
        val expectedOperations = listOf(NoOperation(139), AccumulateOperation(-130), NoOperation(3), AccumulateOperation(1000), JumpOperation(-1))
        val input = """
            nop +139
            acc -130
            nop +3
            acc +1000
            jmp -1
        """.trimIndent()

        val parseResult = parser.parse(input)

        assertThat(parseResult).isEqualTo(expectedOperations)
    }
}