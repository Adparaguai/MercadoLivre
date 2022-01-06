package br.com.apssystem.mercadolivre.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @GetMapping
    fun helloWord(): String{
        return "Hello Word"
    }
}