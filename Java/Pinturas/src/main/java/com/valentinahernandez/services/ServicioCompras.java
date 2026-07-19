package com.valentinahernandez.services;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valentinahernandez.models.Compra;
import com.valentinahernandez.models.Pintura;
import com.valentinahernandez.models.Usuario;
import com.valentinahernandez.repositories.RepositorioCompras;

@Service
public class ServicioCompras {

    @Autowired
    private RepositorioCompras repositorioCompras;

    @Autowired
    private ServicioPinturas servicioPinturas;

    public boolean comprar(Long idPintura, Usuario usuario) {
        Pintura pintura = this.servicioPinturas.obtenerPorId(idPintura);
        if (pintura == null || pintura.getCantidad() <= 0) {
            return false; 
        }

        pintura.setCantidad(pintura.getCantidad() - 1);
        this.servicioPinturas.actualizar(pintura);

        Compra compra = new Compra();
        compra.setUsuario(usuario);
        compra.setPintura(pintura);
        this.repositorioCompras.save(compra);

        return true;
    }

    public List<Pintura> obtenerPinturasCompradasPor(Usuario usuario) {
        List<Compra> compras = this.repositorioCompras.findByUsuario(usuario);
        List<Pintura> pinturas = new ArrayList<>();
        for (Compra compra : compras) {
            pinturas.add(compra.getPintura());
        }
        return pinturas;
    }

    // Lista de usuarios únicos que compraron una pintura específica
    public List<Usuario> obtenerCompradores(Pintura pintura) {
        List<Compra> compras = this.repositorioCompras.findByPintura(pintura);
        Set<Usuario> usuariosUnicos = new LinkedHashSet<>();
        for (Compra compra : compras) {
            usuariosUnicos.add(compra.getUsuario());
        }
        return new ArrayList<>(usuariosUnicos);
    }
}