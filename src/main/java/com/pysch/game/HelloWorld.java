package com.pysch.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-test")
public class HelloWorld {
    @GetMapping("/")
    public  String Hello() {
        return "Welcome to Pysch World";
    }
}
