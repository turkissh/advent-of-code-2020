package day2.case

import day2.CountValidPasswords
import day2.PasswordEntryParser

class PasswordPhilosophyMain {

    fun exec() {
        val parser = PasswordEntryParser()
        val parsedPasswords = parser.parse(PasswordPhilosophyCase.case)

        val count = CountValidPasswords()
        print("DAY 2-1 :Number of valid passwords: ${count(parsedPasswords)}")
    }

}