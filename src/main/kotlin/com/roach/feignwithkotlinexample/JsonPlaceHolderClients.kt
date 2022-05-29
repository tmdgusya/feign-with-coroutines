package com.roach.feignwithkotlinexample

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "jsonPlaceHolder",
    url = "https://jsonplaceholder.typicode.com"
)
interface JsonPlaceHolderClients {

    @GetMapping("todos/{id}")
    fun getTodo(@PathVariable id: Int): TodoInfo
}
