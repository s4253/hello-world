package com.example.helloworld.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@RestController
public class HelloWorld {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world ! This is spring boot demo app ! (app in git)";
    }

    @GetMapping("/name")
    public String helloWorldWithParam(@PathVariable String name) {
        return "Hello world ! My name is :  " + name;
    }

    @PostMapping("/postName")
    public ResponseEntity<Object> postName(@PathVariable String name) {

        return ResponseEntity.created(UriComponentsBuilder.fromHttpUrl("http://abc").build().toUri()).build();
    }


}
