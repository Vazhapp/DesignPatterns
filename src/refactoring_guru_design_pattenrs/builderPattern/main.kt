package refactoring_guru_design_pattenrs.builderPattern

import refactoring_guru_design_pattenrs.builderPattern.carBuilder.Client

fun main() {
    val builderClient = Client()

    builderClient.buildCarWithDirector()
    builderClient.buildCarWithBuilder()

    builderClient.buildCarManual()
}