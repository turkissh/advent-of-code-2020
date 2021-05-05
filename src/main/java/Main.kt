import day1.case.ReportRepairMain
import day2.case.PasswordPhilosophyCase
import day2.case.PasswordPhilosophyMain

fun main(args: Array<String>) {
    val reportRepairMain = ReportRepairMain()
    reportRepairMain.pairs()
    reportRepairMain.triplets()

    val passwordPhilosophyMain = PasswordPhilosophyMain()
    passwordPhilosophyMain.exec()
}