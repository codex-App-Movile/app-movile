package interfaces

import com.example.musictime.beans.ApiResponse
import com.example.musictime.beans.LogInResponse
import com.example.musictime.beans.LoginRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PlaceHolder {
    @POST("auth/login")
    suspend fun logIn(@Body loginRequest: LoginRequest): ApiResponse<LogInResponse>
}