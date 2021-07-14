package day8

interface Operation {
    fun process(state: State): State
}