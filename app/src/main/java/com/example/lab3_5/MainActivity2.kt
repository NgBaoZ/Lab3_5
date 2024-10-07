package com.example.lab3_5
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // Liên kết nút
        val customButton: Button = findViewById(R.id.customButton)
        // Xử lý sự kiện khi nhấn nút
        customButton.setOnClickListener {
            // Thay đổi màu nền khi nhấn
            customButton.setBackgroundColor(Color.parseColor("#FF5722"))
        }
    }
}
