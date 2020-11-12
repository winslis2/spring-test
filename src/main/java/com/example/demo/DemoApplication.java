package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



//@ComponentScan( "com.example.service")
@SpringBootApplication
@ComponentScan(basePackages = {"com.expample.service"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run (DemoApplication.class, args);
    }
}
