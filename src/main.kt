fun main() {

    val user = user {
        "Vazha"
        "Kentchiashvili"
        24
        "vaztest@gmail.com"
        "vashlijvari"
    }
}

data class User(
    var name: String = "",
    var surname: String = "",
    var age: Int = 0,
    var email: String = "",
    var address: String = "",
)

fun user(block: User.() -> Unit): User {
    return User().apply(block)
}