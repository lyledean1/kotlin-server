package com.example.serverdemo
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MainController {

    @RequestMapping("/")
    fun home(): String {
        return "Welcome to Docker apis"
    }

    @RequestMapping("/hello")
    fun helloWorld(): String {
        return "Welcome to Docker apis, This is hello world in docker"
    }
}