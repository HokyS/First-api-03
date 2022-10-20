package com.example.FristApi03.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Strings")
public class StringController {

    @GetMapping
    public String concat(@RequestParam String a, @RequestParam(required = false) String b) {
        if(b == null) {
            b = "";
        }
        return a.concat(b);
    }
}