package xyz.ourguide.app.firstapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// 1. activity_fragment.xml 추가
// 2. MainFragment 클래스 추가

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
        
    }
}










