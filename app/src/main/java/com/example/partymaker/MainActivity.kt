package com.example.partymaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.partymaker.databinding.ActivityMainBinding
import com.jakewharton.threetenabp.AndroidThreeTen
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setMonthView()
    }

    private fun setMonthView() {
        AndroidThreeTen.init(this)
        val selectedDate = LocalDateTime.now()
        val formatted = DateTimeFormatter.ofPattern("yyyy년 MM월")
        binding.monthYearTextView.text = selectedDate.format(formatted).toString()

    }
}