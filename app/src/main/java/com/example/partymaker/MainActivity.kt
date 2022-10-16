package com.example.partymaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.partymaker.databinding.ActivityMainBinding
import com.jakewharton.threetenabp.AndroidThreeTen
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var calandaradapter: CalendarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calandaradapter = CalendarAdapter()

        binding.calandarRecyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = calandaradapter
        }
        setCalendarView()

    }

    private fun setCalendarView() {
        AndroidThreeTen.init(this)
        val selectedDate = LocalDateTime.now()
        val formatted = DateTimeFormatter.ofPattern("yyyy년 MM월")
    }
}