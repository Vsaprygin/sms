package com.vsaprygin.sms

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.vsaprygin.sms.databinding.ActivityFirstBinding
import com.vsaprygin.sms.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    lateinit var binding: ActivitySettingBinding
    lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivitySettingBinding.inflate(layoutInflater)
    setContentView(binding.root)
    val saveTime = "newTimeMin"
            prefs = getSharedPreferences("settings", Context.MODE_PRIVATE)
        binding.saveAdvansed.setOnClickListener {
            val editor = prefs.edit()
            var newTimeMin = binding.timeMin.text
            editor.putInt(saveTime, 55).apply()
           Toast.makeText(this, newTimeMin.toString(), Toast.LENGTH_SHORT).show()
      }
    }
}