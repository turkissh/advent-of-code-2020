package day4.case

import day4.CountValidPassportFields
import day4.PassportFieldsParser
import day4.validator.PresentFieldsValidator
import day4.validator.ValueFieldValidator

class PassportProcessingMain {

    fun exec() {
        val passportFields = PassportFieldsParser().parse(PassportProcessingCase.case)
        val countPresentFields = CountValidPassportFields(PresentFieldsValidator())

        println("DAY 4-1 : Valid passports: ${countPresentFields(passportFields)}")

        val countValueValidFields = CountValidPassportFields(ValueFieldValidator())

        println("DAY 4-2 : Valid passports: ${countValueValidFields(passportFields)}")
    }
}