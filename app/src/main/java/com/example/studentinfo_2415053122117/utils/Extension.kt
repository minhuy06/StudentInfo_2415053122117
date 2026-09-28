package com.example.studentinfo_2415053122117.utils

fun Double.toPassStatus(): String {
    return if (this >= 5.0) "ĐẠT" else "CHƯA ĐẠT"
}

fun String.toUpperCaseName(): String {
    return this.uppercase()
}

fun Double.toAcademicRank(): String {
    return when {
        this >= 8.5 -> "Xuất sắc"
        this >= 7.0 -> "Giỏi"
        this >= 5.5 -> "Khá"
        this >= 4.0 -> "Trung bình"
        else -> "Yếu"
    }
}