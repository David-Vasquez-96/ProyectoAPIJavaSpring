package com.api.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market")
public class HolaMundoController {
    @GetMapping("/hola")
    public String Saludar(){
        return "Hola Mundo, Nunca pares de parender";
    }
}
