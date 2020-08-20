package com.example.homework_zhang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class lianbiaoController {
    @GetMapping(value="/lianbiao")
    @RequestMapping(value="/lianbiao")
    public String z(){

        return "lianbiao";
    }
}