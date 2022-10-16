package com.example.partymaker

import android.app.Application
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.partymaker.databinding.CalanderItemBinding
import com.jakewharton.threetenabp.AndroidThreeTen
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

class CalendarAdapter : RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {

    private lateinit var days: ArrayList<String>
    inner class ViewHolder(private val binding: CalanderItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            AndroidThreeTen.init(Application())
            val selectedDate = LocalDateTime.now()
            val formatted = DateTimeFormatter.ofPattern("yyyy년 MM월")
            val dayOfMonth = binding.monthYearTextView
            dayOfMonth.text = selectedDate.format(formatted).toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = CalanderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 3
    }
}