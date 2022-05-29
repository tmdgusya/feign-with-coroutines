package com.roach.feignwithkotlinexample

data class TodoInfo(
    val userId: Int,
    val id: Int,
    val title: String,
    val completed: Boolean
)
