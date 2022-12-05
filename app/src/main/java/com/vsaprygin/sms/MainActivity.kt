package com.vsaprygin.sms

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.vsaprygin.sms.databinding.ActivityFirstBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSave.setOnClickListener {
            val newSetting = binding.newValue.text.toString()
            if (newSetting == binding.textSeting.text.toString()) {
                Toast.makeText(this, "Изменений нет", Toast.LENGTH_SHORT).show()
            }
            else {Toast.makeText(this, binding.textSeting.text.toString(), Toast.LENGTH_SHORT).show()
                binding.textSeting.text = newSetting
            }
        }
        binding.buttonAdvanset.setOnClickListener {
            val intent = Intent(this,SettingActivity::class.java)
            startActivity(intent)
        }
    }
}