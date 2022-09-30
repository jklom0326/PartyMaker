package com.example.partymaker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter : RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {

    private lateinit var days: ArrayList<String>

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dayOfMonth: TextView = view.findViewById(R.id.celldayText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.calendar_cell, parent, false)
        view.layoutParams.height = (parent.height * 0.166666666).toInt()
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dayOfMonth.text = days[position]
    }

    override fun getItemCount(): Int {
        return days.size
    }
}