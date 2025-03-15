package com.example.HelloWorld;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping("/user")
    public String createUser(@RequestBody User user){
        return "User"+ user.getName()+"Created 404 !";
    }
}
