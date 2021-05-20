package day4

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FieldValidatorTest {

    @Test
    internal fun `validate birthdate year`() {
        val invalidBirthdate = validPassportFields.copy(birthDay = "1919")
        val validator = FieldValidator()

        assertThat(validator.validates(invalidBirthdate)).isFalse
        assertThat(validator.validates(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate issue year`() {
        val invalidIssueDate = validPassportFields.copy(issueYear = "2009")
        val validator = FieldValidator()

        assertThat(validator.validates(invalidIssueDate)).isFalse
        assertThat(validator.validates(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate expiration year`() {
        val invalidExpirationDate = validPassportFields.copy(expirationYear = "2019")
        val validator = FieldValidator()

        assertThat(validator.validates(invalidExpirationDate)).isFalse
        assertThat(validator.validates(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate height`() {
        val invalidHeightInInches = validPassportFields.copy(height = "58in")
        val invalidHeightInCentimeters = validPassportFields.copy(height = "149cm")
        val validHeightInInches = validPassportFields.copy(height = "59in")
        val validator = FieldValidator()

        assertThat(validator.validates(invalidHeightInInches)).isFalse
        assertThat(validator.validates(invalidHeightInCentimeters)).isFalse
        assertThat(validator.validates(validHeightInInches)).isTrue
        assertThat(validator.validates(validPassportFields)).isTrue
    }

    companion object {
        val validPassportFields = PassportFields("1920", "2015", "2025", "150cm", "#121212", "#121212", "028048884", "147")
    }
}

class FieldValidator {
    fun validates(fields: PassportFields): Boolean {
        return isBirthdayValid(fields) && isIssueYearValid(fields) && isExpirationYearValid(fields) && isHeightValid(fields)
    }

    private fun isBirthdayValid(fields: PassportFields) = isFieldInRange(fields.birthDay, 1920..2002)

    private fun isIssueYearValid(fields: PassportFields) = isFieldInRange(fields.issueYear, 2010..2020)

    private fun isExpirationYearValid(fields: PassportFields) = isFieldInRange(fields.expirationYear, 2020..2030)

    private fun isFieldInRange(field: String?, range: ClosedRange<Int>) = field?.let { it.toInt() in range } ?: false

    private fun isHeightValid(fields: PassportFields): Boolean {
        val value = fields.height ?: return false
        return if(value.contains("cm")) {
            isFieldInRange(value.removeSuffix("cm"), 150..193)
        } else {
            isFieldInRange(value.removeSuffix("in"), 59..76)
        }
    }
}
