package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.database

interface DBConnection {
    fun connectDB(url: String, credentials: String)
}