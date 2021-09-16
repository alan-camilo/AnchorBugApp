package com.sample.anchorbugapp.adapter

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sample.anchorbugapp.fragment.BlankFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int) = when(position) {
        0 -> BlankFragment.newInstance("", "")
        else -> BlankFragment.newInstance("", "")
    }
}