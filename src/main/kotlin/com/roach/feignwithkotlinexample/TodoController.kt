package com.roach.feignwithkotlinexample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(
    val jsonPlaceHolderAdapter: JsonPlaceHolderAdapter
) {

    @GetMapping("/todo/{id}")
    suspend fun getTodo(@PathVariable id: Int): TodoInfo {
        return jsonPlaceHolderAdapter.getTodo(id)
    }
}
