package com.hunau.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public HelloController() {
    }

    @GetMapping({"/hello"})
    public String hello() {
        return "余新伟 学号为201841882320";
    }
}