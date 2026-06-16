package com.valentinahernandez.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ControladorPeliculas {
    
    private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();


    public ControladorPeliculas() {
	listaPeliculas.put("Winnie the Pooh", "Don Hall");	
	listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
	listaPeliculas.put("Tarzán", "Kevin Lima");		
	listaPeliculas.put("Mulán", "Barry Cook");
	listaPeliculas.put("Oliver", "Kevin Lima");	
	listaPeliculas.put("Big Hero 6", "Don Hall");	
 
    }



//metodo responde con una lista de todas las peliculas
@GetMapping("/peliculas")
public Map<String, String> obtenerTodasLasPeliculas() {
    return listaPeliculas; 
}


//
@GetMapping("/peliculas/{nombre}")
public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
    for (String pelicula : listaPeliculas.keySet()) {

	if (pelicula.equalsIgnoreCase(nombre)) {
        return "el director de " + pelicula + "es " + listaPeliculas.get(pelicula) ;
    }
}

	return "La película no se encuentra en nuestra lista";
}


@GetMapping("/peliculas/director/{nombre}")
public List<String> obtenerPeliculasPorDirector(@PathVariable String nombre) {
    List<String> resultado = new ArrayList<>();

    for (String pelicula : listaPeliculas.keySet()) {
        if (listaPeliculas.get(pelicula).equalsIgnoreCase(nombre)) {
            resultado.add(pelicula); 
        }
    }

    if (resultado.isEmpty()) {
        resultado.add("No contamos con películas con ese director en nuestra lista");
    }

    return resultado; 
}
}
