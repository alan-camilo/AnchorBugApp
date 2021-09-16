package com.sample.anchorbugapp.activity

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.sample.anchorbugapp.R
import com.sample.anchorbugapp.adapter.ViewPagerAdapter

class AnchoredViewPagerActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anchored_view_pager)
    }

    override fun onResume() {
        super.onResume()
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        with(viewPager) {
            adapter = ViewPagerAdapter(this@AnchoredViewPagerActivity)
        }

        val mediator = TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> "Tab 1"
                else -> "Tab 2"
            }.also { titleId ->
                tab.text = titleId
            }
        }
        mediator.attach()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "AnchoredViewPagerActivity destroyed", Toast.LENGTH_SHORT).show()
    }
}