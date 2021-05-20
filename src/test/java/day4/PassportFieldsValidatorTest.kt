package day4

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PassportFieldsValidatorTest {

    @Test
    internal fun `passport having all fields present is valid`() {
        val passportFields = createAllPassportFields()
        val validator = PassportFieldsValidator()

        val isValid = validator.areValid(passportFields)

        assertThat(isValid).isTrue
    }

    @Test
    internal fun `passport missing country id is valid`() {
        val passportFields = createAllPassportFieldsButCountryId()
        val validator = PassportFieldsValidator()

        val isValid = validator.areValid(passportFields)

        assertThat(isValid).isTrue
    }

    @Test
    internal fun `passport with missing field is invalid`() {
        val passportFields = createPassportFieldsWithMissingField()
        val validator = PassportFieldsValidator()

        val isValid = validator.areValid(passportFields)

        assertThat(isValid).isFalse
    }

    private fun createAllPassportFields() = PassportFields("1234", "1234", "1234", "150cm", "#121212", "#121212", "028048884", "147")

    private fun createAllPassportFieldsButCountryId() = PassportFields(
        "1234", "1234", "1234", "150cm",
        "#121212", "#121212", "028048884", null)

    private fun createPassportFieldsWithMissingField() = PassportFields("1234", "1234", "1234", "150cm", "", "#121212", "028048884", "147")
}

