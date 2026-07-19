package com.valentinahernandez.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valentinahernandez.models.Compra;
import com.valentinahernandez.models.Pintura;
import com.valentinahernandez.models.Usuario;

@Repository
public interface RepositorioCompras extends JpaRepository<Compra, Long> {
    List<Compra> findByPintura(Pintura pintura);
    List<Compra> findByUsuario(Usuario usuario);
}