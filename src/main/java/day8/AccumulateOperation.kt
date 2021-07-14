package day8

data class AccumulateOperation(private val argument: Int) : Operation {
    override fun process(state: State): State {
        return State(state.accumulator + argument, state.instructionPointer + 1)
    }
}