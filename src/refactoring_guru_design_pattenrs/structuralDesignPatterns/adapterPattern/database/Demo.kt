package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.database

fun main() {
    val oldDBDriver = OldDBDriver()
    val dbConnectionAdapter = DBConnectionAdapter(oldDBDriver)

    val usersDataBase = UsersDataBase(
        dbConnectionAdapter
    )

    usersDataBase.connectUsersBase(
        url = "users.creds:8080",
        credentials = "admin admin"
    )
}