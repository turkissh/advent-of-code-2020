package day4

import day4.validator.PassportFieldValidator

class CountValidPassportFields(private val passportFieldValidator: PassportFieldValidator) {

    operator fun invoke(passportFieldsList: List<PassportFields>): Int {
        return passportFieldsList.count { passportFieldValidator.areValid(it) }
    }

}