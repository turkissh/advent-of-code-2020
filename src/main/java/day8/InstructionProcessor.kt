package day8

data class ProcessResult(val isSuccessful: Boolean, val stackTrace: ArrayDeque<Int>, val accumulator: Int)

class InstructionProcessor {

    fun process(operations: List<Operation>): ProcessResult {
        val pointers = mutableSetOf<Int>()
        var previousState = initialState
        var state = initialState
        val stacktrace = ArrayDeque<Int>()

        while (hasANextOperation(state, operations)) {
            if (instructionWasExecuted(pointers, state)) return ProcessResult(false, stacktrace, previousState.accumulator)
            previousState = state
            stacktrace.addFirst(state.instructionPointer)
            state = executeOperation(state, operations, pointers)
        }

        return ProcessResult(true, stacktrace, state.accumulator)
    }

    private fun executeOperation(currentState: State, operations: List<Operation>, pointers: MutableSet<Int>): State {
        saveExecutedInstruction(pointers, currentState)
        return operations[currentState.instructionPointer].process(currentState)
    }

    private fun saveExecutedInstruction(pointers: MutableSet<Int>, state: State) {
        pointers.add(state.instructionPointer)
    }

    private fun hasANextOperation(state: State, operations: List<Operation>) = state.instructionPointer < operations.size

    private fun instructionWasExecuted(pointers: MutableSet<Int>, state: State) =
        pointers.contains(state.instructionPointer)

    private companion object {
        val initialState = State(0, 0)
    }
}