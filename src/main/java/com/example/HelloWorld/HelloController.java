package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World";
    }
    @GetMapping("/user")
    public String getUser(){
        return "User Details:John Doe";
    }


}
