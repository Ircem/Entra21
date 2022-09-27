package com.Bolas_Grandes_volumosas.WDB.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class generalController {
    @GetMapping("/")
    public String index() {
        return "ola mundo!";
    }
    @PostMapping("/")
    public String indexPost(){
        return "Agora com POST";
    }

    @GetMapping("/teste")
    public String outroindex(){
        return "usado URI teste";
    }
    @GetMapping("/teste/{parametro}")
    public String comParametro(@PathVariable Integer parametro){  
        if(parametro <= 50){     
        return "Voce passou " + parametro + "    valor";
        }else{
            return "Yuri é metido";
            
        }
    }
}
  