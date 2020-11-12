package com.example.service;

import com.example.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonService {
    @GetMapping("/hello")
    public Person getPerson() {
        return new Person ();
    }
}
