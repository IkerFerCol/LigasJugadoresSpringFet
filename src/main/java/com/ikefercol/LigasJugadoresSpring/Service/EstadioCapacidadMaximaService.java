package com.ikefercol.LigasJugadoresSpring.Service;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Equipo;
import com.ikefercol.LigasJugadoresSpring.model.Entidades.Estadio;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadioCapacidadMaximaService {

    @Autowired
    private EstadioRepository estadioRepository;

    public List<Estadio> obtenerEstadiosConCapacidadMaxima(int capacidadMaxima){
        List<Estadio> todosLosEstadios = estadioRepository.findAll();
        List<Estadio> estadiosFiltrados = new ArrayList<>();

        for (Estadio estadio : todosLosEstadios) {
            if (estadio.getCapacidad() < capacidadMaxima) {
                estadiosFiltrados.add(estadio);
            }
        }
        return estadiosFiltrados;
    }

    public Iterable<Estadio> getAllEstadios() {
        return estadioRepository.findAll();
    }
}
