package com.example.easytranzv3.ui.routier.general

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.easytranzv3.DisputeDetailView
import com.example.easytranzv3.R


/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class RoutierGeneralRecyclerViewAdapter(
    private val values: List<RoutierGeneralDisputesContent.DisputesItem>/*, var mContext: Context*/
) : RecyclerView.Adapter<RoutierGeneralRecyclerViewAdapter.ViewHolder>() {

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

    class ViewHolder(view: View, var item: RoutierGeneralDisputesContent.DisputesItem? = null): RecyclerView.ViewHolder(view) {

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
            //mContext.startActivity(Intent(mContext, DisputeDetailView::class.java))
            }
        }

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }
}