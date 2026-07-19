package com.valentinahernandez.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.valentinahernandez.models.Usuario;
import java.util.Optional;

@Repository
public interface RepositorioUsuarios extends CrudRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
}