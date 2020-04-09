package andre.vicente.yahoostocks.data

import andre.vicente.yahoostocks.data.model.User
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<User> {

        return Result.Success(User())
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

