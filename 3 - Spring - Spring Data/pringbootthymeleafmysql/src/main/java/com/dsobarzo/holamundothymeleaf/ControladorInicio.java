package com.dsobarzo.holamundothymeleaf;

import com.dsobarzo.holamundothymeleaf.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import java.util.ArrayList;
import java.util.Arrays;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    // "/" Ruta en blanco -> LocalHost
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola Mundo Con Thymeleaf";
        var mensaje2 = "Nuevo mensaje!!!";
        var persona = new Persona();
        persona.setNombre("Diego");
        persona.setApellido("Sobarzo");
        persona.setEmail("diego.sobarzo.o@gmail.com");
        persona.setTelefono("956079568");

        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Riquelme");
        persona2.setEmail("karla.riquelme@gmail.com");
        persona2.setTelefono("958621258");

        /*var personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);*/

        //var personas = Arrays.asList(persona, persona2);
        var personas = Arrays.asList();

        log.info("Ejecutando el controlador SpringMCV");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("mensaje2", mensaje2);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
