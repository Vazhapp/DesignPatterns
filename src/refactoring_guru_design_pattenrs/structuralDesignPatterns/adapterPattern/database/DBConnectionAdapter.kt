package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.database

class DBConnectionAdapter(private val oldDBDriver: OldDBDriver) : DBConnection {
    override fun connectDB(url: String, credentials: String) {
        println("Adapting from DBConnection to OldDBDriver | JUST IGNORING CREDENTIALS")
        println(oldDBDriver.connectDatabase(url))
    }
}