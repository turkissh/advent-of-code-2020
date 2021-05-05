package day2

interface Policy {
    fun validates(password: String): Boolean
}

