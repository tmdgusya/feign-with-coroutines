package com.roach.feignwithkotlinexample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(
    val jsonPlaceHolderClients: JsonPlaceHolderClients
) {

    @GetMapping("/todo/{id}")
    suspend fun getTodo(@PathVariable id: Int): TodoInfo {
        val async = CoroutineScope(Dispatchers.IO).async {
            withContext(Dispatchers.IO) {
                jsonPlaceHolderClients.getTodo(id)
            }
        }
        return async.await()
    }
}
