package refactoring_guru_design_pattenrs.adapterPattern.database

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