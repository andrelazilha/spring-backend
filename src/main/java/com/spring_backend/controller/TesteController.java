package com.spring_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Olá, André! O back-end está funcionando";
    }
}