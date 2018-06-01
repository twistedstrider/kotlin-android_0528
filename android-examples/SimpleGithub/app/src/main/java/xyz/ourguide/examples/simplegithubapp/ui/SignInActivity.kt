package xyz.ourguide.examples.simplegithubapp.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import xyz.ourguide.examples.simplegithubapp.R

// Social Login - Github Login
//   1. Firebase Login - Github
//       + FirebaseUI
//    => OAuth2

//   2. Github OAuth2 Login
//   3. Github OAuth App 추가
//         GITHUB_CLIENT_ID
//         GITHUB_CLIENT_SECRET
//      app - gradle.properties



class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }
}
