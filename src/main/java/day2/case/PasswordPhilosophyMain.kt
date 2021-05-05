package day2.case

import day2.CountValidPasswords
import day2.PasswordEntryParser
import day2.policies.CharacterCountPolicyFactory
import day2.policies.CharacterInPositionPolicyFactory

class PasswordPhilosophyMain {

    fun exec() {
        val parser = PasswordEntryParser()
        val count = CountValidPasswords()

        val characterCountParsedPasswords = parser.parse(PasswordPhilosophyCase.case, CharacterCountPolicyFactory())
        val characterInPositionParsedPasswords = parser.parse(PasswordPhilosophyCase.case, CharacterInPositionPolicyFactory())

        println("DAY 2-1 : Number of valid passwords: ${count(characterCountParsedPasswords)}")
        println("DAY 2-2 : Number of valid passwords: ${count(characterInPositionParsedPasswords)}")
    }
}