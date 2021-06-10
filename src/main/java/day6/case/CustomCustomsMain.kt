package day6.case

import day6.GroupAnswersParser

class CustomCustomsMain {
    
    fun exec() {
        val groupAnswers = GroupAnswersParser().parse(CustomCustomsCase.case)

        val different = groupAnswers.fold(0, { acc, current -> acc + current.numberOfDifferentQuestions})

        println("DAY 6-1 : Sum of all groups different questions answered: $different")

        val common = groupAnswers.fold(0, { acc, current -> acc + current.numberOfRepeatedQuestions})

        println("DAY 6-2 : Sum of all groups common questions answered: $common")
    }
    
}