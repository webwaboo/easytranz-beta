package com.example.easytranzv3.ui.aerien.international

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.easytranzv3.DisputeDetailView
import com.example.easytranzv3.R


class AerienIntRecyclerViewAdapter(
    private val values: List<AerienIntDisputesContent.DisputesItem>/*, var mContext: Context*/
) : RecyclerView.Adapter<AerienIntRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.title
        //holder.contentView.text = item.content

        holder?.item = item

    }

    override fun getItemCount(): Int = values.size

    class ViewHolder(view: View, var item: AerienIntDisputesContent.DisputesItem? = null) :
        RecyclerView.ViewHolder(view) {

        companion object {
            val DISPUTE_DETAIL_KEY = "DISPUTE_DETAIL"
            val DISPUTE_TITLE_KEY = "DISPUTE_TITLE"
        }

        val idView: TextView = view.findViewById(R.id.item_number)
        val contentView: TextView = view.findViewById(R.id.content)
        val intent: Intent? = null

        init {
            view.setOnClickListener {
                val intent = Intent(view.context, DisputeDetailView::class.java)
                intent.putExtra(DISPUTE_DETAIL_KEY, item?.details)
                intent.putExtra(DISPUTE_TITLE_KEY, item?.title)
                view.context.startActivity(intent)
            }
        }


    }
}