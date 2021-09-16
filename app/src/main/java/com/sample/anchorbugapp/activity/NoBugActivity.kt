package com.sample.anchorbugapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.sample.anchorbugapp.R
import com.sample.anchorbugapp.adapter.ViewPagerAdapter

class NoBugActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_bug)
    }

    override fun onResume() {
        super.onResume()
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        with(viewPager) {
            adapter = ViewPagerAdapter(this@NoBugActivity)
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
        Toast.makeText(this, "NoBugActivity destroyed", Toast.LENGTH_SHORT).show()
    }
}