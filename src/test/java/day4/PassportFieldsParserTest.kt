package day4

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PassportFieldsParserTest {

    @Test
    internal fun `parse unique passport`() {
        val parser = PassportFieldsParser()

        val passportFieldsList = parser.parse(uniquePassportInput)

        assertThat(passportFieldsList).isEqualTo(listOf(expectedUniquePassport))
    }

    @Test
    internal fun `parse multiple passports`() {
        val parser = PassportFieldsParser()

        val passportFieldsList = parser.parse(multiplePassportsInput)

        assertThat(passportFieldsList).isEqualTo(expectedMultiplePassportsFields)
    }

    private companion object {
        val uniquePassportInput = """
            eyr:2029 cid:2048 pid:157374862
            byr:1991 ecl:amb hcl:#a97842 iyr:1979 hgt:178cm
        """.trimIndent()
        val expectedUniquePassport = PassportFields("1991", "1979", "2029", "178cm", "#a97842", "amb", "157374862", "2048")

        val multiplePassportsInput = """
               eyr:2029 cid:2048 pid:157374862
            byr:1991 ecl:amb hcl:#a97842 iyr:1979 hgt:178cm

               byr:1962 pid:547578491 eyr:2028 ecl:hzl hgt:65in iyr:2013 hcl:#623a2f
        """.trimIndent()

        val expectedMultiplePassportsFields = listOf(
            PassportFields("1991", "1979", "2029", "178cm", "#a97842", "amb", "157374862", "2048"),
            PassportFields("1962", "2013", "2028", "65in", "#623a2f", "hzl", "547578491", null)
        )
    }
}

