package ar.edu.unju.fi.tp02_grupoxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp02_grupoxx.model.Paseador;
import ar.edu.unju.fi.tp02_grupoxx.util.ListaPaseadores;

@Controller
@RequestMapping("/paseos")
public class ServiciosPaseosController {
    
    @Autowired
    private Paseador paseador;

    private ListaPaseadores listaPaseadores;

    @GetMapping("/")
    public String getPaseosPage(){
        // se instancia para poder ver los paseadores 
        this.listaPaseadores = new ListaPaseadores();

        
        return "servicios_paseos";
    }

    @GetMapping("/nuevo")
    public ModelAndView getNuevoPaseador(){
        ModelAndView modelAndView = new ModelAndView("nuevo_paseador");
        modelAndView.addObject("paseador", this.paseador);
        return modelAndView;
    }

    @PostMapping("/guardar")
    public ModelAndView guardarPaseador(@ModelAttribute(name = "paseador")Paseador paseador){
        ModelAndView modelAndView = new ModelAndView("servicios_paseos");
        this.listaPaseadores.getPaseadores().add(paseador);
        modelAndView.addObject("listadoPaseadores", this.listaPaseadores.getPaseadores());
        return modelAndView;
    }


}
