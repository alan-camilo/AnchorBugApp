package com.sample.anchorbugapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sample.anchorbugapp.R
import com.sample.anchorbugapp.adapter.RecyclerViewAdapter

class AnchoredRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anchored_recycler_view)
    }

    override fun onResume() {
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        with(recyclerView) {
            adapter = RecyclerViewAdapter()
            layoutManager = LinearLayoutManager(this@AnchoredRecyclerViewActivity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "AnchoredRecyclerViewActivity destroyed", Toast.LENGTH_SHORT).show()
    }
}