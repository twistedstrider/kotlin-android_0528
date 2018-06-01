package xyz.ourguide.examples.simplegithubapp.api.model

import com.google.gson.annotations.SerializedName

/*
   "access_token": String,
   "scope": String
   "token_type": String
*/

// Retrofit - 1. Model 만든다.
data class GithubAccessToken(@field:SerializedName("access_token") val accessToken: String,
                             val scope: String,
                             @field:SerializedName("token_type") val tokenType: String)