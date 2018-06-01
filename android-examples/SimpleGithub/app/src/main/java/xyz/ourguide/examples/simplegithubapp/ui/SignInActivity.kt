package xyz.ourguide.examples.simplegithubapp.ui

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.customtabs.CustomTabsIntent
import kotlinx.android.synthetic.main.activity_sign_in.*
import org.jetbrains.anko.toast
import xyz.ourguide.examples.simplegithubapp.BuildConfig
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


        btnActivitySignInStart.setOnClickListener {

            // Github OAuth Login
            // https://github.com/login/oauth/authorize?client_id=<ID>

            val authUri = Uri.Builder().apply {
                scheme("https")
                authority("github.com")
                appendPath("login")
                appendPath("oauth")
                appendPath("authorize")
                appendQueryParameter("client_id", BuildConfig.GITHUB_CLIENT_ID)
            }.build()

            toast(authUri.toString())
            val intent = CustomTabsIntent.Builder().build()
            intent.launchUrl(this, authUri)

            // redirect uri: simplegithub://authorize
        }

    }

    // redirect Intent에서 code를 얻어올 수 있다. - launchMode: singleTask
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        toast("onNewIntent")
        intent?.let {
            val uri = intent.data ?: throw IllegalStateException("No data exist")
            val code = uri.getQueryParameter("code") ?:
                    throw IllegalStateException("No code exist")

            toast(code)
            // api.github.com - login 요청
            //  => Access Token

            // OKHttpClient -> 요청 -> JSON -> GithubAccessToken
            //                            Gson
        }


    }


}










