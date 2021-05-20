package day4.case

import day4.CountValidPassportFields
import day4.PassportFieldsParser
import day4.PassportFieldsValidator

class PassportProcessingMain {

    fun exec() {
        val passportFields = PassportFieldsParser().parse(PassportProcessingCase.case)
        val countValid = CountValidPassportFields(PassportFieldsValidator())

        val validPassportCount = countValid(passportFields)

        println("DAY 4-1 : Valid passports: $validPassportCount")
    }
}