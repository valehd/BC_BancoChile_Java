package com.valentinahernandez.servicios;

import java.util.List;
import java.util.Optional; 
import com.valentinahernandez.modelos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.valentinahernandez.repositorios.RepositorioArtistas; 

@Service
public class ServicioArtistas {
    
    @Autowired
    private RepositorioArtistas repositorioArtistas;

    public List<Artista> obtenerTodosLosArtistas() {
        return repositorioArtistas.findAll();
    }


    public Artista obtenerArtistaPorId(Long id) {
        return this.repositorioArtistas.findById(id).orElse(null);
    }

    public Artista agregarArtista(Artista artista){
        return repositorioArtistas.save(artista);
    }
}
