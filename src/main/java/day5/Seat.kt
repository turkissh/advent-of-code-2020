package day5

data class Seat(val row: Int, val column: Int) {
    val id = row * 8 + column
}