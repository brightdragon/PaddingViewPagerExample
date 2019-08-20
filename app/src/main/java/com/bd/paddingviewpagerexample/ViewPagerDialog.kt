package com.bd.paddingviewpagerexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_viewpager.*

class ViewPagerDialog : DialogFragment() {

    companion object {
        val TAG: String = ViewPagerDialog::class.java.simpleName
        fun newInstance() = ViewPagerDialog()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, R.style.ViewPagerDialog)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_viewpager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewpager.apply {

            val dpValue = 20
            val density = resources.displayMetrics.density
            val margin = (dpValue * density).toInt()

            setPadding(margin, 250, margin, 250)
            clipToPadding = false
            pageMargin = (margin / 2)
            adapter = ViewPagerAdapter(childFragmentManager)
        }
    }
}