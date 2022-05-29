package com.roach.feignwithkotlinexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class FeignWithKotlinExampleApplication

fun main(args: Array<String>) {
    runApplication<FeignWithKotlinExampleApplication>(*args)
}
