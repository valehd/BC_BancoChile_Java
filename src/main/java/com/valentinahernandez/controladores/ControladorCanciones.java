package com.valentinahernandez.controladores;

import java.util.List;
import com.valentinahernandez.modelos.Cancion;
import com.valentinahernandez.servicios.ServicioCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {

    @Autowired
    private ServicioCanciones servicioCanciones;

    @GetMapping("/canciones")
    public String desplegarCanciones(Model modelo) {
        List<Cancion> canciones = servicioCanciones.obtenerTodasLasCanciones();
        modelo.addAttribute("listaCanciones", canciones);
        return "canciones";
    }

    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion, Model modelo) {
        Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
        modelo.addAttribute("cancion", cancion);
        return "detalleCancion";
    }


        @GetMapping("/canciones/formulario/agregar/{idCancion}")
    public String formularioAgregarCancion(@PathVariable("idCancion") Long idCancion, Model modelo) {
        modelo.addAttribute("cancion", new Cancion());
        return "agregarCancion";
    }

    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, BindingResult result) {
        if (result.hasErrors()) {
            return "agregarCancion";
        }
        servicioCanciones.agregarCancion(cancion);
        return "redirect:/canciones";
    }



@GetMapping("/canciones/formulario/editar/{idCancion}")
public String formularioEditarCancion(@PathVariable("idCancion") Long idCancion, Model modelo) {
    Cancion cancionExistente = servicioCanciones.obtenerCancionPorId(idCancion);
    modelo.addAttribute("cancion", cancionExistente);
    return "editarCancion";
}

@PostMapping("/canciones/procesa/editar/{idCancion}")
public String procesarEditarCancion(
        @PathVariable("idCancion") Long idCancion, 
        @Valid @ModelAttribute("cancion") Cancion cancion, 
        BindingResult result) {
        
    if (result.hasErrors()) {
        return "editarCancion";
    }
    
    cancion.setId(idCancion);
    servicioCanciones.actualizaCancion(cancion);
    return "redirect:/canciones";
}

@GetMapping("/canciones/eliminar/{idCancion}")
public String procesarEliminarCancion(@PathVariable("idCancion") Long idCancion) {
    servicioCanciones.eliminaCancion(idCancion);
    return "redirect:/canciones";
}



}