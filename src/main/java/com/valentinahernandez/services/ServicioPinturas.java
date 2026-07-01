package com.valentinahernandez.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.valentinahernandez.repositories.RepositorioPinturas;
import com.valentinahernandez.models.Pintura;

@Service
public class ServicioPinturas {

    @Autowired
    private RepositorioPinturas repositorioPinturas;

    public Pintura crear(Pintura pintura) {
        return this.repositorioPinturas.save(pintura);
    }

    public List<Pintura> obtenerTodas() {
        return (List<Pintura>) this.repositorioPinturas.findAll();
    }

    public Pintura obtenerPorId(Long id) {
        return this.repositorioPinturas.findById(id).orElse(null);
    }

    public Pintura obtenerPorTitulo(String titulo) {
        return this.repositorioPinturas.findByTitulo(titulo).orElse(null);
    }

    public Pintura actualizar(Pintura pintura) {
        return this.repositorioPinturas.save(pintura);
    }

    public void eliminar(Long id) {
        this.repositorioPinturas.deleteById(id);
    }

  public BindingResult validarPinturaUnica(BindingResult validaciones, Pintura pintura) {
    Pintura pinturaDB = this.obtenerPorTitulo(pintura.getTitulo());
    if (pinturaDB != null && !pinturaDB.getId().equals(pintura.getId())) {
        validaciones.rejectValue("titulo", "tituloRepetido", "La pintura ya existe, debe ser único.");
    }
    return validaciones;
}
}