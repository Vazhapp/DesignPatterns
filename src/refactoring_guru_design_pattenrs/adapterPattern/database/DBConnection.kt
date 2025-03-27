package refactoring_guru_design_pattenrs.adapterPattern.database

interface DBConnection {
    fun connectDB(url: String, credentials: String)
}