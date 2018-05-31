package xyz.ourguide.app.firstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/

// Kotlin Android Extension
//   => Extension Function
//   => 모듈 수준 build.gradle에서
//      apply plugin

/*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton = findViewById<Button>(R.id.helloButton)
        val textView = findViewById<TextView>(R.id.textView)
        helloButton.setOnClickListener {
            textView.setText("Hello, Kotlin")
        }
    }
}
*/


// findViewById는 더 이상 사용할 필요가 없습니다.
//    => layout.xml 파일에서 설정한 view id를 바로 참조로 접근 가능합니다.

//   android:id="@+id/button_hello"  <- 이런 스타일의 이름 지정은 지양하는 것이 좋습니다.
//   android:id="@+id/helloButton"

//   Refactor - Rename
//    : Shift + F6
//    * layout 파일에서 이름을 변경하면 적용됩니다.


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hiButton.setOnClickListener {
            textView.setText("Hello, Kotlin")
        }
    }
}























