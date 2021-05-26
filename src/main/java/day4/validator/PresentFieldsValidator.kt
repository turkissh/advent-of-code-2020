package day4.validator

import day4.PassportFields

class PresentFieldsValidator: PassportFieldValidator {
    override fun areValid(passportFields: PassportFields): Boolean {

        return !passportFields.birthDay.isNullOrEmpty() &&
                !passportFields.issueYear.isNullOrEmpty() &&
                !passportFields.expirationYear.isNullOrEmpty() &&
                !passportFields.height.isNullOrEmpty() &&
                !passportFields.hairColor.isNullOrEmpty() &&
                !passportFields.eyeColor.isNullOrEmpty() &&
                !passportFields.passportId.isNullOrEmpty()
    }
}