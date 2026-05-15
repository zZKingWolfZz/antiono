package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formcontroller {

    @GetMapping("/")
    public String mostrarFormulario() {
        return "index"; // Esto buscará el archivo index.html en templates
    }
}