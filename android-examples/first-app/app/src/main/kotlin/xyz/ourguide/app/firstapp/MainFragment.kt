package xyz.ourguide.app.firstapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_main.*

// 1. activity_fragment.xml 추가
// 2. MainFragment 클래스 추가
// 3. Fragment를 Activity에 붙인다.

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_main,
                container,
                false)
    }

    // Activity: onCreate
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        submitButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            val message = "$email / $password"
            Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
        }
    }
}










