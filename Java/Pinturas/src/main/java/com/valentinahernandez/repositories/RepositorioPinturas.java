package com.valentinahernandez.repositories;
import org.springframework.stereotype.Repository;

import com.valentinahernandez.models.Pintura;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


@Repository
public interface RepositorioPinturas extends CrudRepository<Pintura, Long> {
    Optional<Pintura> findByTitulo(String titulo);
}



