package day2

data class PasswordEntry(private val policy: Policy, private val password: String) {
    fun isValid() = policy.validates(password)
}