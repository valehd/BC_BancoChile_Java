package com.valentinaernandez.controladores;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorRecetas {

    private static final String[] listaRecetas = new String[]{"Pizza", "Espagueti", "Lasaña"};
    private static final HashMap<String, String[]> recetasConIngredientes = new HashMap<>();

    public ControladorRecetas() {
        String[] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
        recetasConIngredientes.put("Pizza", pizza);

        String[] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
        recetasConIngredientes.put("Espagueti", espagueti);

        String[] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
        recetasConIngredientes.put("Lasaña", lasaña);
    }

    @GetMapping("/recetas")
    public String obtenerTodasLasRecetas(Model modelo) {
        modelo.addAttribute("listaRecetas", listaRecetas);
        return "recetas"; 
    }

    @GetMapping("/recetas/{nombre}")
    public String obtenerRecetaPorNombre(@PathVariable("nombre") String nombre, Model modelo) {
        
        String[] ingredientes = recetasConIngredientes.get(nombre);
        if (ingredientes == null) {
            modelo.addAttribute("mensajeError", "La receta no se encuentra en nuestra lista.");
        } else {
        modelo.addAttribute("nombreReceta", nombre);
        modelo.addAttribute("ingredientesReceta", ingredientes);
		}
        return "detalleReceta"; 
    }
}
