package day2

class CountValidPasswords() {
    operator fun invoke(entries: List<PasswordEntry>): Int {
        return entries.count { entry -> entry.isValid() }
    }
}