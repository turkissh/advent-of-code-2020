package day8

data class NoOperation(val argument: Int) : Operation {
    override fun process(state: State): State {
        return State(state.accumulator, state.instructionPointer + 1)
    }
}