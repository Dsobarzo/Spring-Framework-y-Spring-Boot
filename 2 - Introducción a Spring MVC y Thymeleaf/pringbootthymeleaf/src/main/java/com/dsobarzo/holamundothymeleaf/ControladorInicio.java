package com.dsobarzo.holamundothymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    // "/" Ruta en blanco -> LocalHost
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola Mundo Con Thymeleaf";
        log.info("Ejecutando el controlador SpringMCV");
        model.addAttribute("mensaje", mensaje);
        return "index";
    }
}
