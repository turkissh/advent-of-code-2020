package day8

data class JumpOperation(val argument: Int) : Operation {
    override fun process(state: State): State {
        return State(state.accumulator, state.instructionPointer + argument)
    }
}