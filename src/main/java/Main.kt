import day1.case.ReportRepairMain
import day2.case.PasswordPhilosophyMain
import day3.case.TobogganTrajectoryMain
import day4.case.PassportProcessingMain
import day5.case.BinaryBoardingMain
import day6.case.CustomCustomsMain

fun main(args: Array<String>) {
    val reportRepairMain = ReportRepairMain()
    reportRepairMain.pairs()
    reportRepairMain.triplets()

    println()

    val passwordPhilosophyMain = PasswordPhilosophyMain()
    passwordPhilosophyMain.exec()

    println()

    val tobogganTrajectoryMain = TobogganTrajectoryMain()
    tobogganTrajectoryMain.exec()

    println()

    val passportProcessingMain = PassportProcessingMain()
    passportProcessingMain.exec()

    println()

    val binaryBoardingMain = BinaryBoardingMain()
    binaryBoardingMain.exec()

    println()

    val customCustomsMain = CustomCustomsMain()
    customCustomsMain.exec()
}