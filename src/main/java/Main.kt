import day1.case.ReportRepairMain
import day2.case.PasswordPhilosophyMain
import day3.case.TobogganTrajectoryMain

fun main(args: Array<String>) {
    val reportRepairMain = ReportRepairMain()
    reportRepairMain.pairs()
    reportRepairMain.triplets()

    val passwordPhilosophyMain = PasswordPhilosophyMain()
    passwordPhilosophyMain.exec()

    val tobogganTrajectoryMain = TobogganTrajectoryMain()
    tobogganTrajectoryMain.exec()
}