package com.bd.paddingviewpagerexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return ViewPagerFragment.newInstance(position)
    }

    override fun getCount(): Int {
        return 5
    }
}