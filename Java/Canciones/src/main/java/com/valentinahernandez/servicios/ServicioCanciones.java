package com.valentinahernandez.servicios;


import java.util.List;
import java.util.Optional;
import com.valentinahernandez.modelos.Cancion;
import com.valentinahernandez.repositorios.RepositorioCanciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioCanciones {

    @Autowired
    private RepositorioCanciones repositorioCanciones;

    public List<Cancion> obtenerTodasLasCanciones() {
        return repositorioCanciones.findAll();
    }

    public Cancion obtenerCancionPorId(Long id) {
        Optional<Cancion> opcionalCancion = repositorioCanciones.findById(id);
        return opcionalCancion.orElse(null);
    }

    public Cancion agregarCancion(Cancion cancion) {
        return repositorioCanciones.save(cancion);
    }
    public Cancion actualizaCancion(Cancion cancion) {
    return repositorioCanciones.save(cancion);
}
public void eliminaCancion(Long id) {
    repositorioCanciones.deleteById(id);
}
}