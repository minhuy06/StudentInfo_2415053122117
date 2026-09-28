package com.example.studentinfo_2415053122117.utils

fun Double.toPassStatus(): String {
    return if (this >= 5.0) {
        "Trạng thái: ĐẠT"
    } else {
        "Trạng thái: CHƯA ĐẠT"
    }
}