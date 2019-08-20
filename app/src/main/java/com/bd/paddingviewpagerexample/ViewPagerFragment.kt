package com.bd.paddingviewpagerexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_viewpager.*

class ViewPagerFragment : Fragment() {

    companion object {
        fun newInstance(number: Int): ViewPagerFragment {
            val fragment = ViewPagerFragment()
            val bundle = Bundle()
            bundle.putInt("number", number)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_viewpager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pager_text.setText("Fragment Number : ${arguments!!.getInt("number")}")
    }
}