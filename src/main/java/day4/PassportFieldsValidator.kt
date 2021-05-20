package day4

class PassportFieldsValidator {
    fun areValid(passportFields: PassportFields): Boolean {

        return !passportFields.birthDay.isNullOrEmpty() &&
                !passportFields.issueYear.isNullOrEmpty() &&
                !passportFields.expirationYear.isNullOrEmpty() &&
                !passportFields.height.isNullOrEmpty() &&
                !passportFields.hairColor.isNullOrEmpty() &&
                !passportFields.eyeColor.isNullOrEmpty() &&
                !passportFields.passportId.isNullOrEmpty()
    }
}