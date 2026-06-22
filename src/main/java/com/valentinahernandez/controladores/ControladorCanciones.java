package com.valentinahernandez.controladores;

import java.util.List;
import com.valentinahernandez.modelos.Cancion;
import com.valentinahernandez.servicios.ServicioCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}