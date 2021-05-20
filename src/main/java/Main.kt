import day1.case.ReportRepairMain
import day2.case.PasswordPhilosophyMain
import day3.case.TobogganTrajectoryMain
import day4.case.PassportProcessingMain

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
}