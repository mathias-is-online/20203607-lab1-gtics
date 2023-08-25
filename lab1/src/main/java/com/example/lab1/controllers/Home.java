package com.example.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping(value = "")
    public String listar() {
        return "job/lista";
    }






}
