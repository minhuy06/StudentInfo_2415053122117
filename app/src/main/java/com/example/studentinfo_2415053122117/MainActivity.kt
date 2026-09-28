package com.example.studentinfo_2415053122117

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentinfo_2415053122117.databinding.ActivityMainBinding
import com.example.studentinfo_2415053122117.model.Student
import com.example.studentinfo_2415053122117.utils.toPassStatus

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myProfile = Student(
            mssv = "2415053122117",
            fullName = "Võ Minh Huy",
            className = "24T1",
            age = 20,
            score = 8.5
        )

        with(binding) {
            tvMssv.text = "Mã sinh viên: ${myProfile.mssv}"
            tvName.text = "Họ và tên: ${myProfile.fullName}"
            tvClass.text = "Lớp: ${myProfile.className}"
            tvAge.text = "Tuổi: ${myProfile.age}"
            tvScore.text = "Điểm tổng kết: ${myProfile.score}"

            tvStatus.text = myProfile.score.toPassStatus()

            if (myProfile.score >= 5.0) {
                tvStatus.setTextColor(Color.parseColor("#388E3C")) // Xanh lá
            } else {
                tvStatus.setTextColor(Color.parseColor("#D32F2F")) // Đỏ
            }
        }
    }
}