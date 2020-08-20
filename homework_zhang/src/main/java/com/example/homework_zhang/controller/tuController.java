package com.example.homework_zhang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class tuController {
    @GetMapping(value="/tu")
    @RequestMapping(value="/tu")
    public String z(){

        return "tu";
    }
}
