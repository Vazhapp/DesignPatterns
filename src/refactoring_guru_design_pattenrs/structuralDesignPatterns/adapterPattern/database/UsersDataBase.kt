package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.database

class UsersDataBase(
    private val dbConnection: DBConnection
) {
    fun connectUsersBase(url: String, credentials: String) {
        dbConnection.connectDB(
            url,
            credentials,
        )
    }
}