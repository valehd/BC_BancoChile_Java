package com.valentinahernandez.controladores;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ControladorLibros {
    
    private static HashMap<String, String> listaLibros = new HashMap<String, String>();

    public ControladorLibros() {
	listaLibros.put("Odisea", "Homero");	
	listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
	listaLibros.put("El Código Da Vinci", "Dan Brown");		
	listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
	listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
	listaLibros.put("El alquimista", "Paulo Coelho");	
}


@GetMapping("/libros")
public String obtenerTodosLosLibros(Model model){
    model.addAttribute("libros",listaLibros);

    return "libros";
}

@GetMapping("/libros/{nombre}")
public String obtenerInformacionDeLibro(@PathVariable("nombre") String nombre, Model model) {

        if (listaLibros.containsKey(nombre)) {
        model.addAttribute("nombre", nombre);
        model.addAttribute("autor", listaLibros.get(nombre));
        } else {
        model.addAttribute("error", "El libro no se encuentra en nuestra lista.");
        }
        return "detalleLibro";
}



 @GetMapping("/libros/formulario")
    public String formularioLibro() {
        return "formularioLibros";
    }


        @PostMapping("/procesa/libro")
    public String procesaLibro(@RequestParam("nombreLibro") String nombreLibro, 
@RequestParam("nombreAutor") String nombreAutor) {
        listaLibros.put(nombreLibro, nombreAutor);
        return "redirect:/libros";
    }



}
