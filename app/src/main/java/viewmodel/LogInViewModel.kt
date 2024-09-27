package viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.musictime.beans.LogInResponse
import com.example.musictime.beans.LoginRequest
import client.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel : ViewModel() {
    private val placeholderService = RetrofitClient.placeHolder
    var loginres: LogInResponse = LogInResponse("")

    fun logIn(email: String, password: String) {
        val loginRequest = LoginRequest(email, password)
        Log.e("LoginViewModel", loginRequest.toString())

        viewModelScope.launch(Dispatchers.IO) {
            val response = placeholderService.logIn(loginRequest)

            withContext(Dispatchers.Main) {
                if(response!=null) {
                    loginres.token = response.data.token
                    Log.e("LoginViewModel", "res: ${response.data.token}")
                }

            }
        }
    }
}