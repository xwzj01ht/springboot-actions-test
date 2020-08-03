package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ht
 * @date 2020/8/3
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    public String helloWorld() {
        return "Hello World!";
    }
}
