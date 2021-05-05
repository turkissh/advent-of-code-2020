package day2.policies

import day2.CharacterCountPolicy
import day2.CharacterInPositionPolicy
import day2.Policy

interface PolicyFactory {
    fun create(character: Char, num1: Int, num2: Int): Policy
}

class CharacterCountPolicyFactory : PolicyFactory {
    override fun create(character: Char, num1: Int, num2: Int): Policy {
        return CharacterCountPolicy(character, num1, num2)
    }
}

class CharacterInPositionPolicyFactory : PolicyFactory {
    override fun create(character: Char, num1: Int, num2: Int): Policy {
        return CharacterInPositionPolicy(character, num1, num2)
    }
}