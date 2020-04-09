package andre.vicente.yahoostocks.data

import andre.vicente.yahoostocks.data.model.User
import android.util.Log
import com.google.firebase.auth.FirebaseAuth


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<User> {
        val mAuth : FirebaseAuth = FirebaseAuth.getInstance()
        mAuth.signInWithEmailAndPassword("tehuberz@yahoo.com","pokemon").addOnCompleteListener {
            Log.d(this.javaClass.name,"Login Successful!!")
        }

        return Result.Success(User())
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

