package com.dsobarzo.holaspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    // "/" Ruta en blanco -> LocalHost
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador Rest");
        log.debug("Mas detalles del controlador");
        return "Hola Mundo Con SpringBoot";
    }
}
