package com.expample.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonService {
    @GetMapping("/hello")
    public String getPerson() {
        return "hel22122";
    }
}
