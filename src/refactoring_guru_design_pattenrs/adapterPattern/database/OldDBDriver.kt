package refactoring_guru_design_pattenrs.adapterPattern.database

class OldDBDriver {
    fun connectDatabase(url: String): String = if (url.isNotEmpty()) "Connected Successfully" else "Connection Error"
}