package xyz.ourguide.app.ankoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// Anko
//  : Jetbrains 직접 제작하여 배포하는 코틀린 라이브러리
//  => DSL(Domain Specific Language)
//  => 기존에 안드로이드에서 작성하던 수많은 보일러플레이트를 없앨 수 있다.
//  1) Anko Commons
//  2) Anko Layout

//  3) Anko SQLite
//  4) Anko Coroutine => 비동기 흐름제어 => RxJava

// Kotlin 1.1 - Coroutine(Experimental)


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
