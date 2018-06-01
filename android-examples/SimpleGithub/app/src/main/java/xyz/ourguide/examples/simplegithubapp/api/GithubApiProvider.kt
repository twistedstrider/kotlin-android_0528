package xyz.ourguide.examples.simplegithubapp.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Retrofit -> Client(Singleton)

// Retrofit Logging Interceptor
private val loggingInterceptor = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}

private val httpClient = OkHttpClient.Builder().apply {
    addInterceptor(loggingInterceptor)
}.build()

val authApi: AuthApi = Retrofit.Builder().apply {
    baseUrl("https://github.com")
    client(httpClient)
    addConverterFactory(GsonConverterFactory.create()) // Gson Serialization / Deserialization
}.build().create(AuthApi::class.java)

