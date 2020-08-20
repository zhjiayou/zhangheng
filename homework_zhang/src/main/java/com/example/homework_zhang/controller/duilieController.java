package com.example.homework_zhang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class duilieController {
    @GetMapping(value="/duilie")
    @RequestMapping(value="/duilie")
    public String z(){

        return "duilie";
    }
}

