package day4

import day4.validator.ValueFieldValidator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValueFieldValidatorTest {

    private val validator = ValueFieldValidator()

    @Test
    internal fun `validate birthdate year`() {
        val invalidBirthdate = validPassportFields.copy(birthDay = "1919")

        assertThat(validator.areValid(invalidBirthdate)).isFalse
        assertThat(validator.areValid(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate issue year`() {
        val invalidIssueDate = validPassportFields.copy(issueYear = "2009")

        assertThat(validator.areValid(invalidIssueDate)).isFalse
        assertThat(validator.areValid(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate expiration year`() {
        val invalidExpirationDate = validPassportFields.copy(expirationYear = "2019")

        assertThat(validator.areValid(invalidExpirationDate)).isFalse
        assertThat(validator.areValid(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate height`() {
        val invalidHeightInInches = validPassportFields.copy(height = "58in")
        val invalidHeightInCentimeters = validPassportFields.copy(height = "149cm")
        val validHeightInInches = validPassportFields.copy(height = "59in")
        val validator = ValueFieldValidator()

        assertThat(validator.areValid(invalidHeightInInches)).isFalse
        assertThat(validator.areValid(invalidHeightInCentimeters)).isFalse
        assertThat(validator.areValid(validHeightInInches)).isTrue
        assertThat(validator.areValid(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate hair color`() {

        val invalidHairColors = listOf(
            validPassportFields.copy(hairColor = "123AF1"),
            validPassportFields.copy(hairColor = "#123AZ1"),
            validPassportFields.copy(hairColor = "#123AF12"),
            validPassportFields.copy(hairColor = "#1AF12")
        )

        assertThat(invalidHairColors).allMatch { !validator.areValid(it) }
        assertThat(validator.areValid(validPassportFields)).isTrue
    }

    @Test
    internal fun `validate eyes color`() {
        val invalidEyesColor = validPassportFields.copy(eyeColor = "azules")
        val validEyesColors = listOf("amb","blu","brn","gry","grn","hzl","oth").map {
            validPassportFields.copy(eyeColor = it)
        }

        assertThat(validEyesColors).allMatch { validator.areValid(it) }
        assertThat(validator.areValid(invalidEyesColor)).isFalse
    }

    @Test
    internal fun `validate passport id`() {

        val invalidPassportIds = listOf("123", "12345678A", "AAAA")
            .map { validPassportFields.copy(passportId = it) }

        assertThat(invalidPassportIds).allMatch { !validator.areValid(it) }
        assertThat(validator.areValid(validPassportFields)).isTrue
    }

    companion object {
        val validPassportFields = PassportFields("1920", "2015", "2025", "150cm", "#121212", "blu", "028048884", "147")
    }
}

