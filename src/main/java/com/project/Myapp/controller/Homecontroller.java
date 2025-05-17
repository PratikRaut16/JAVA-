package com.project.Myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller
{
    @GetMapping("/")
    public String greet()
    {
        return "Welcome to my app";
    }

    @GetMapping("/about")
    public String about()
    {
        return "Welcome to about my app";
    }
}
