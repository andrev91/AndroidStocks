package andre.vicente.yahoostocks.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class User(
        val userId: String?= "",
        val username: String?= "",
        val userFirstName: String?= "",
        val userLastName: String?= "",
        val userEmail: String?= ""
)
