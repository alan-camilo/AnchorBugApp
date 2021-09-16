package com.sample.anchorbugapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sample.anchorbugapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        findViewById<Button>(R.id.buttonViewpager).setOnClickListener {
            val intent = Intent(this, AnchoredViewPagerActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonRecyclerView).setOnClickListener {
            val intent = Intent(this, AnchoredRecyclerViewActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonNoBug).setOnClickListener {
            val intent = Intent(this, NoBugActivity::class.java)
            startActivity(intent)
        }
    }
}