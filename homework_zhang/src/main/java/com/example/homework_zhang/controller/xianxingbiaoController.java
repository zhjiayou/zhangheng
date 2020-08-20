package com.example.homework_zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class xianxingbiaoController {
    @GetMapping(value="/xianxingbiao")
    @RequestMapping(value="/xianxingbiao")
    public String z(){

        return "xianxingbiao";
    }
}
