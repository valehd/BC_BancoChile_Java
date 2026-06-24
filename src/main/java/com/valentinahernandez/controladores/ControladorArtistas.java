package com.valentinahernandez.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.valentinahernandez.modelos.Artista;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import com.valentinahernandez.servicios.*;

@Controller
public class ControladorArtistas {


@Autowired
private ServicioArtistas servicioArtistas;



@GetMapping("/artistas")
public String desplegarArtistas(Model modelo){

    modelo.addAttribute(
        "listaArtistas",
        servicioArtistas.obtenerTodosLosArtistas()
    );

    return "artistas";
}

    @GetMapping("/artistas/{idArtista}")
   public String desplegarDetalleArtista(@PathVariable("idArtista") Long idArtista, Model modelo){
    Artista artista= servicioArtistas.obtenerArtistaPorId(idArtista);
    modelo.addAttribute("artista", artista);
    return "detalleArtista";
   }


      @GetMapping("/artistas/formulario/agregar")
    public String formularioAgregarArtista(Model modelo){
        modelo.addAttribute("artista", new Artista());
        return "agregarArtista";
    }    

  
    @PostMapping("/artistas/procesa/agregar")
   public String procesarAgregarArtista(@Valid @ModelAttribute("artista") Artista artista, BindingResult result){
   if (result.hasErrors()){
            return "agregarArtista";
        }

        servicioArtistas.agregarArtista(artista);
        return "redirect:/canciones/formulario/agregar"; 
    }


}

