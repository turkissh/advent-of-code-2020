package day2

class CountValidPasswords() {
    operator fun invoke(entries: List<day2.PasswordEntry>): Int {
        return entries.count { entry -> entry.isValid() }
    }
}