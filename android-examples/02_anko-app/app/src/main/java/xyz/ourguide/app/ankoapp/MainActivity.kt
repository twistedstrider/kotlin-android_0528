package xyz.ourguide.app.ankoapp

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.activity_sub.view.*
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.Appcompat
import java.util.*

// Anko
//  : Jetbrains 직접 제작하여 배포하는 코틀린 라이브러리
//  => DSL(Domain Specific Language)
//  => 기존에 안드로이드에서 작성하던 수많은 보일러플레이트를 없앨 수 있다.
//  1) Anko Commons
//  2) Anko Layout

//  3) Anko SQLite
//  4) Anko Coroutine => 비동기 흐름제어 => RxJava

// Kotlin 1.1 - Coroutine(Experimental)

// Anko


/*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            // 1. Toast
            // Toast.makeText(this, "Toast!", Toast.LENGTH_SHORT).show()
            // toast("Toast!")
            // longToast("Toast!")

            // 2. AlertDialog
            /*
            val dialog = AlertDialog.Builder(this)
                    .setTitle("Dialog Title")
                    .setMessage("Dialog Message")
                    .setPositiveButton("Yes") { _, _ ->
                        toast("Yes")
                    }
                    .setNegativeButton("No") { _, _ ->
                        toast("No")
                    }
                    .create()
            dialog.show()
            */

            /*
            alert(title="Dialog Title", message = "Dialog Message") {
                positiveButton("Yes") {
                    toast("Yes")
                }
                negativeButton("No") {
                    toast("No")
                }
            }.show()
            */

            // Appcompat: Support Library Dialog 생성하는 Anko Dialog 코드
            /*
            alert(Appcompat, title="Dialog Title", message = "Dialog Message") {
                positiveButton("Yes") {
                    toast("Yes")
                }
                negativeButton("No") {
                    toast("No")
                }
            }.show()
            */

            /*
            // Selector Dialog도 만들 수 있습니다.
            val names = listOf("Tom", "Bob", "Alice")
            selector(title = "Select User", items = names) { _, index ->
                toast("Selected name - ${names[index]}")
            }
            */

            // Progress Dialog
            /*
            val progressDialog = progressDialog(title = "File Download", message = "Downloading")
            progressDialog.setCancelable(false)

            val timerTask = object : TimerTask() {
                override fun run() {
                    progressDialog.progress += 10
                    if (progressDialog.progress >= 100)
                        progressDialog.dismiss()
                }
            }

            val timer = Timer()
            timer.scheduleAtFixedRate(timerTask, 0, 100)
            */

            // indeterminateProgressDialog("Please wait")
        }

    }
}
*/


/*
// Activity 전환
// 1. SubActivity.kt
// 2. AndroidManifest.xml
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            /*
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
            */

            /*
            startActivity<SubActivity>(
                    "name" to "Tom",
                    "age" to 42)
            */
            val intent = intentFor<SubActivity>(
                    "name" to "Tom",
                    "age" to 42).clearTop()

            startActivity(intent)
        }

    }
}
*/


// Anko Layout
// 1. 코드를 이용해서 View를 구성하는 것은 어렵다.
// 2. XML로 정의된 뷰를 사용하는 경우, 파싱에 대한 비용이 소모됩니다.
//    "성능", "배터리" => 코드를 통해 뷰를 구성할 수 있도록 하겠다.

// AnkoLogger: Logger
//   'TAG'


class MainActivity : AppCompatActivity(), AnkoLogger {
//    companion object {
//        val TAG = MainActivity::class.java.simpleName
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Log.i(TAG, "onCreate")
        info("onCreate")
        debug("onCreate")
        error("onCreate")
        wtf("onCreate")


        MainActivityUI().setContentView(this)
        // setContentView(R.layout.activity_main)

    }
}

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = ui.apply {
        verticalLayout {
            textView("Enter Login E-mail Address")
            padding = dip(16)

            editText {
                hint = "E-mail"
            }

            editText {
                hint = "Password"
            }

            button(text = "Submit")
        }

    }.view
}






class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        /*
        val name = intent?.getStringExtra("name") ?: "Unnamed"
        val age = intent?.getIntExtra("age") ?: 0
        textView.text = "$name($age)"
        */

        intent?.let {
            val name = it.getStringExtra("name")
            val age = it.getIntExtra("age", 0)

            textView.text = "$name($age)"
        }
    }
}









