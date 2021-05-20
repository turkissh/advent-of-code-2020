package day4

class CountValidPassportFields(private val passwordValidator: PassportFieldsValidator) {

    operator fun invoke(passportFieldsList: List<PassportFields>): Int {
        return passportFieldsList.count { passwordValidator.areValid(it) }
    }

}