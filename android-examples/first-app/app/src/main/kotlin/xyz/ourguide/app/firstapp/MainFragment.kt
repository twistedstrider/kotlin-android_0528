package xyz.ourguide.app.firstapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main2.*

// 1. activity_fragment.xml 추가
// 2. MainFragment 클래스 추가
// 3. Fragment를 Activity에 붙인다.

/*
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
}*/

// RecyclerView
//  : ListView를 대체하기 위해서 나왔다.
//   1) 레이아웃을 변경하는 것이 어렵다.
//     => 내부 아이템의 레이아웃에 대한 정책을 변경하는 것이 가능하다.
//   2) 사용자가 직접 최적화를 해야 한다.
//     => View Holder Pattern
//     => Recycler View는 View Holder Pattern을 자동적으로 적용한다.

// Designer
//   1) Sketch
//   2) Adobe XD

// Designer <=> Zeplin <=> Programmer

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_main2,
                container,
                false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        cityRecyclerView.layoutManager = LinearLayoutManager(activity)
        // cityRecyclerView.adapter = CityAdapter()
    }
}



















