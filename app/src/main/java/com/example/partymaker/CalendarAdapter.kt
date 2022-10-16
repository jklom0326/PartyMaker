package com.example.partymaker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.partymaker.databinding.CalanderItemBinding

class CalendarAdapter : RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {

    private lateinit var days: ArrayList<String>

    inner class ViewHolder(private val binding: CalanderItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val dayOfMonth: TextView = binding.monthYearTextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = CalanderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dayOfMonth.text = days[position]
    }

    override fun getItemCount(): Int {
        return days.size
    }
}
//
//class DateAdapter(private val view: CalendarAdapter) : RecyclerView.ViewHolder(view.root) {
//
//}

//LayoutInflater.from(parent.context).inflate(R.layout.calendar_cell, parent, false)
//view.layoutParams.height = (parent.height * 0.166666666).toInt()