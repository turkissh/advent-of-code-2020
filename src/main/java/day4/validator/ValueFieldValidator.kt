package day4.validator

import day4.PassportFields

class ValueFieldValidator : PassportFieldValidator {
    override fun areValid(fields: PassportFields): Boolean {
        return isBirthdayValid(fields) &&
                isIssueYearValid(fields) &&
                isExpirationYearValid(fields) &&
                isHeightValid(fields) &&
                isHairColorValid(fields) &&
                isEyesColorValid(fields) &&
                isPassportIdValid(fields)
    }

    private fun isBirthdayValid(fields: PassportFields) = isFieldInRange(fields.birthDay, 1920..2002)

    private fun isIssueYearValid(fields: PassportFields) = isFieldInRange(fields.issueYear, 2010..2020)

    private fun isExpirationYearValid(fields: PassportFields) = isFieldInRange(fields.expirationYear, 2020..2030)

    private fun isFieldInRange(field: String?, range: ClosedRange<Int>) = field?.let { it.toInt() in range } ?: false

    private fun isHeightValid(fields: PassportFields): Boolean {
        val value = fields.height ?: return false
        return if (value.contains("cm")) {
            isFieldInRange(value.removeSuffix("cm"), 150..193)
        } else {
            isFieldInRange(value.removeSuffix("in"), 59..76)
        }
    }

    private fun isHairColorValid(fields: PassportFields): Boolean {
        val value = fields.hairColor ?: return false
        return HairColorRegex.containsMatchIn(value)
    }

    private fun isEyesColorValid(fields: PassportFields): Boolean {
        val color = fields.eyeColor ?: return false
        val validColors = listOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth")

        return validColors.contains(color)
    }

    private fun isPassportIdValid(fields: PassportFields): Boolean {
        val passportId = fields.passportId ?: return false
        val passportIdRegex = "^\\d{9}\$".toRegex()
        return passportIdRegex.containsMatchIn(passportId)
    }

    private companion object {
        val HairColorRegex = "^#(?:[0-9a-fA-F]{3}){1,2}\$".toRegex()
    }
}