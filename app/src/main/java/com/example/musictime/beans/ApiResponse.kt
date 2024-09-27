package com.example.musictime.beans

data class ApiResponse<T> (
    var message:String,
    var status: String,
    var data: T
)
