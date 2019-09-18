package com.example.serverdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerdemoApplication

fun main(args: Array<String>) {
    runApplication<ServerdemoApplication>(*args)
}
