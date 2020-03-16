package com.komiles.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    public String test(@RequestParam(value = "name", defaultValue = "1234")  String name)
    {
        return name;
    }

    @GetMapping("kongming")
    public String kongming()
    {
        System.out.println("kongming");
        return "kongming";
    }
}
