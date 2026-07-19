package com.valentinahernandez.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.valentinahernandez.models.Pintura;
import com.valentinahernandez.models.Usuario;
import com.valentinahernandez.services.ServicioCompras;
import com.valentinahernandez.services.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControladorCompras {

    @Autowired
    private ServicioCompras servicioCompras;

    @Autowired
    private ServicioUsuarios servicioUsuarios;

    @PostMapping("/comprar/{id}")
    public String comprar(@PathVariable("id") Long idPintura, HttpSession sesion) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }

        Usuario usuario = this.servicioUsuarios.obtenerPorId(idUsuario);
        this.servicioCompras.comprar(idPintura, usuario);

        return "redirect:/mis-compras";
    }

    @GetMapping("/mis-compras")
    public String misCompras(HttpSession sesion, Model modelo) {
        Long idUsuario = (Long) sesion.getAttribute("idUsuario");
        if (idUsuario == null) {
            return "redirect:/";
        }

        Usuario usuario = this.servicioUsuarios.obtenerPorId(idUsuario);
        List<Pintura> pinturasCompradas = this.servicioCompras.obtenerPinturasCompradasPor(usuario);

        modelo.addAttribute("pinturas", pinturasCompradas);
        modelo.addAttribute("idUsuario", idUsuario);
        return "mis-compras.jsp";
    }
}