package com.example.helloworld.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloWorld {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world ! This is spring boot demo app !";
    }

}
