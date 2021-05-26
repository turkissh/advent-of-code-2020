package day4.validator

import day4.PassportFields

interface PassportFieldValidator {
    fun areValid(passportFields: PassportFields): Boolean
}