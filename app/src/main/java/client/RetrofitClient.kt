package client

import androidx.constraintlayout.widget.Placeholder
import interfaces.PlaceHolder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val placeHolder: PlaceHolder by lazy {
        Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PlaceHolder::class.java)
    }
}