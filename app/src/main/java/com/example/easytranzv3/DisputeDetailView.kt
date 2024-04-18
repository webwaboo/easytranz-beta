package com.example.easytranzv3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.easytranzv3.ui.routier.general.RoutierGeneralRecyclerViewAdapter

class DisputeDetailView: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dispute_details)

        //change something navbar and content of textview
        val navBarTitle = intent.getStringExtra(RoutierGeneralRecyclerViewAdapter.ViewHolder.DISPUTE_TITLE_KEY)
        val txtView = findViewById<TextView>(R.id.textView2)
        val txtdetail = intent.getStringExtra(RoutierGeneralRecyclerViewAdapter.ViewHolder.DISPUTE_DETAIL_KEY)
        txtView.text = txtdetail
        supportActionBar?.title = navBarTitle
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}