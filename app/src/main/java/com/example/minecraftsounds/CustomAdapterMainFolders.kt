package com.example.minecraftsounds

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapterMainFolders(private val dataSet: Array<String>) :
        RecyclerView.Adapter<CustomAdapterMainFolders.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.txtMainFolders)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int):
            ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.main_folders, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.textView.text = dataSet[i]
    }

    override fun getItemCount() = dataSet.size

    }

}