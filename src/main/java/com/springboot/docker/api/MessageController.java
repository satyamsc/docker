package com.springboot.docker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/message")
public class MessageController {
    @GetMapping
    public String getMessage() {
        return "Welcome to dockerized application..!!";
    }
}
