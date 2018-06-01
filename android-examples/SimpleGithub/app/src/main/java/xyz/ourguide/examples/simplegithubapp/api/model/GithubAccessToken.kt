package xyz.ourguide.examples.simplegithubapp.api.model

import com.google.gson.annotations.SerializedName

/*
   "access_token": String,
   "scope": String
   "token_type": String
*/

data class GithubAccessToken(@field:SerializedName("access_token") val accessToken: String,
                             val scope: String,
                             @field:SerializedName("token_type") val tokenType: String)