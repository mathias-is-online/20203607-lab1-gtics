package com.example.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {

    @GetMapping(value = "")
    public String listar(Model model, @RequestParam(name = "code", required = false) String code) {

        try{
            if (code.equals("PUCP")){
                model.addAttribute("ruta","img/logoPUCP");
                System.out.println("si hubo code");
            }
        }catch (Exception e){
            System.out.println("no hubo code");
        }


        return "index";
    }

}
