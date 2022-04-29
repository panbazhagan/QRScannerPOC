package com.example.demoverifyapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.demoverifyapp.analyzer.AnalyzerSetting
import com.example.demoverifyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var startTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.scanQr.setOnClickListener {
            startTime = System.currentTimeMillis()
            Log.d("TOTP START", startTime.toString())
            startActivityForResult(Intent(this, ScanActivity::class.java), 32)
        }

        binding.switchBtn.setOnCheckedChangeListener { _, isChecked -> AnalyzerSetting.useMlKit = isChecked }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val totp = data?.getStringExtra("TOTP")

        binding.totpText.text = totp?:""
        Log.d("TOTP END", (System.currentTimeMillis() - startTime).toString())    }
}