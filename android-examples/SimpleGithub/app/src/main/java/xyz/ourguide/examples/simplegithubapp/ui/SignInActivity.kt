package xyz.ourguide.examples.simplegithubapp.ui

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.customtabs.CustomTabsIntent
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import xyz.ourguide.examples.simplegithubapp.BuildConfig
import xyz.ourguide.examples.simplegithubapp.R
import xyz.ourguide.examples.simplegithubapp.api.authApi
import xyz.ourguide.examples.simplegithubapp.api.model.GithubAccessToken

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

    override fun onStop() {
        super.onStop()

        call?.cancel()
    }

    // 화면이 사라질 경우, 요청을 취소해야 한다.
    private var call: Call<GithubAccessToken>? = null

    // redirect Intent에서 code를 얻어올 수 있다. - launchMode: singleTask
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        toast("onNewIntent")
        intent?.let {
            val uri = intent.data ?: throw IllegalStateException("No data exist")
            val code = uri.getQueryParameter("code") ?: throw IllegalStateException("No code exist")

            toast(code)
            // api.github.com - login 요청
            //  => Access Token

            // OKHttpClient -> 요청 -> JSON -> GithubAccessToken
            //                            Gson

            call = authApi.getAccessToken(clientId = BuildConfig.GITHUB_CLIENT_ID,
                    clientSecret = BuildConfig.GITHUB_CLIENT_SECRET,
                    code = code)

            showProgress()
            /*
            call?.enqueue(object : Callback<GithubAccessToken> {
                override fun onResponse(call: Call<GithubAccessToken>,
                                        response: Response<GithubAccessToken>) {
                    hideProgress()

                    val token = response.body()
                    if (response.isSuccessful && token != null) {

                        Toast.makeText(this@SignInActivity, "token: ${token.accessToken}", Toast.LENGTH_SHORT).show()

                    } else {
                        showError("Request failed: ${response.message()}")
                    }

                }

                override fun onFailure(call: Call<GithubAccessToken>,
                                       t: Throwable) {
                    hideProgress()

                    showError(t.message)
                }
            })
            */
        }
    }

    private fun showError(message: String?) {
        toast("error: $message")
    }

    private fun showProgress() {
        btnActivitySignInStart.visibility = View.GONE
        pbActivitySignIn.visibility = View.VISIBLE
    }

    private fun hideProgress() {
        btnActivitySignInStart.visibility = View.VISIBLE
        pbActivitySignIn.visibility = View.GONE
    }


}

fun <T> Call<T>.enqueue(success: (response: Response<T>) -> Unit,
                        failure: (t: Throwable) -> Unit) {

    enqueue(object : Callback<T> {
        override fun onResponse(call: Call<T>?, response: Response<T>) = success(response)
        override fun onFailure(call: Call<T>?, t: Throwable) = failure(t)
    })
}








