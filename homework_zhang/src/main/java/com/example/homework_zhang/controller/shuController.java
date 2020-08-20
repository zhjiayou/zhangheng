package com.example.homework_zhang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class shuController {
    @GetMapping(value="/shu")
    @RequestMapping(value="/shu")
    public String z(){

        return "shu";
    }
}

