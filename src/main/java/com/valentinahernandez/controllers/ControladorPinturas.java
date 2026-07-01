package com.valentinahernandez.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.valentinahernandez.models.Pintura;
import com.valentinahernandez.models.Usuario;
import com.valentinahernandez.services.ServicioCompras;
import com.valentinahernandez.services.ServicioPinturas;
import com.valentinahernandez.services.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorPinturas {

    @Autowired
    private ServicioPinturas servicioPinturas;

    @Autowired
    private ServicioUsuarios servicioUsuarios;

    @Autowired
private ServicioCompras servicioCompras; 

    @GetMapping("/pinturas") // Muestra todas las pinturas
    public String mostrarPinturas(Model modelo, HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }
        List<Pintura> pinturas = this.servicioPinturas.obtenerTodas();
        modelo.addAttribute("pinturas", pinturas);
        return "pinturas.jsp";
    }

    @GetMapping("/form/add") // Form de creacion
    public String formAgregar(HttpSession sesion, Model modelo) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }
        modelo.addAttribute("pintura", new Pintura());
        return "agregar.jsp";
    }

    @GetMapping("/form/edit/{id}") // Form de edicion
    public String formEditar(HttpSession sesion, Model modelo, @PathVariable("id") Long id) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }
        modelo.addAttribute("pintura", this.servicioPinturas.obtenerPorId(id));
        return "editar.jsp";
    }


    @PostMapping("/add") // Procesa creacion
    public String guardar(@Valid @ModelAttribute("pintura") Pintura pintura, BindingResult validaciones,
                           HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }

        validaciones = this.servicioPinturas.validarPinturaUnica(validaciones, pintura);
        if (validaciones.hasErrors()) {
            return "agregar.jsp";
        }

        Usuario usuario = this.servicioUsuarios.obtenerPorId(idUsuario);
        pintura.setCreador(usuario);

        this.servicioPinturas.crear(pintura);
        return "redirect:/pinturas";
    }


    @PutMapping("/edit") // Procesa edicion
    public String actualizar(@Valid @ModelAttribute("pintura") Pintura pintura, BindingResult validaciones,
                              HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }

        validaciones = this.servicioPinturas.validarPinturaUnica(validaciones, pintura);
        if (validaciones.hasErrors()) {
            return "editar.jsp";
        }

        Pintura pinturaDB = this.servicioPinturas.obtenerPorId(pintura.getId());
        pintura.setCreador(pinturaDB.getCreador());

        this.servicioPinturas.actualizar(pintura);
        return "redirect:/pinturas";
    }



    @GetMapping("/detail/{id}") // Ruta detalle
    public String detalle(@PathVariable("id") Long id, HttpSession sesion, Model modelo) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }
            Pintura pintura = this.servicioPinturas.obtenerPorId(id);
    if (pintura == null) {
        return "redirect:/pinturas";
    }

        modelo.addAttribute("pintura", this.servicioPinturas.obtenerPorId(id));
       modelo.addAttribute("idUsuario", idUsuario); 
      modelo.addAttribute("compradores", this.servicioCompras.obtenerCompradores(pintura)); 
       return "detalle.jsp";
    }

    @DeleteMapping("/delete/{id}") // Procesa borrado
    public String eliminar(@PathVariable("id") Long id) {
        this.servicioPinturas.eliminar(id);
        return "redirect:/pinturas";
    }
}