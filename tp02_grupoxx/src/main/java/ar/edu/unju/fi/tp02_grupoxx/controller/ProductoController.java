package ar.edu.unju.fi.tp02_grupoxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp02_grupoxx.model.Producto;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private Producto producto;

    private List<Producto> productos = new ArrayList<Producto>();

    @GetMapping("/nuevo")
    public String getNuevoProducto(Model model){                
        model.addAttribute("producto", producto);
        return "nuevo_producto";
    }

    @PostMapping("/guardar")
    public ModelAndView guardarProducto(@ModelAttribute(name = "producto")Producto producto){
        ModelAndView modelAndView = new ModelAndView("listado_productos");
        this.productos.add(producto);
        modelAndView.addObject("productos", this.productos);

        return modelAndView;

    }


}
