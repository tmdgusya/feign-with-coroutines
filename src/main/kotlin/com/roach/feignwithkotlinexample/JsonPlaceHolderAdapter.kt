package com.roach.feignwithkotlinexample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Component

@Component
class JsonPlaceHolderAdapter(
    val jsonPlaceHolderClients: JsonPlaceHolderClients
) {

    suspend fun getTodo(id: Int): TodoInfo {
        return withContext(Dispatchers.IO) {
            jsonPlaceHolderClients.getTodo(id)
        }
    }
}
