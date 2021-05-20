package day4

import java.util.regex.Pattern

class PassportFieldsParser {
    fun parse(uniquePassportInput: String): List<PassportFields> {

        val passportEntries = uniquePassportInput.trim().split(Pattern.compile("\\n\\n"))

        return passportEntries.map {
            val rawFields = it.trim().split(Pattern.compile("(\\s|\\r)"))

            val map: MutableMap<String, String> = mutableMapOf()
            for (rawField in rawFields) {
                val splitField = rawField.trim().split(':')
                map[splitField[0]] = splitField[1]
            }

            PassportFields(map["byr"], map["iyr"], map["eyr"], map["hgt"], map["hcl"], map["ecl"], map["pid"], map["cid"])
        }.toList()
    }
}