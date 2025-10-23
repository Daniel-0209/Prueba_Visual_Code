package com.ejemplo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("mensaje","Hola mundo desde Springboot!");
        return "index";
    } 

     // Nueva ruta "/hola"
    @GetMapping("/hola")
    public String hola(){
        return "hola"; // busca hola.html en templates/
    }

}

 