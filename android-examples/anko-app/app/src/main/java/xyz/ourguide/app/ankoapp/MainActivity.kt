package xyz.ourguide.app.ankoapp

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

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

        }

    }
}













