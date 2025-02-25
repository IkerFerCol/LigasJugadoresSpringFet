package com.ikefercol.LigasJugadoresSpring.Service;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Equipo;
import com.ikefercol.LigasJugadoresSpring.model.Entidades.Liga;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LigaObtenerTodas {

    @Autowired
    private LigaRepository ligaRepository;

    public List<Liga> obtenerTodasLasLigas() {
        return ligaRepository.findAll();
    }

    public Optional<Liga> obtenerLigasPorId(Long id) {
        return ligaRepository.findById(id);
    }

    public Iterable<Liga> getAllLigas() {
        return ligaRepository.findAll();
    }
}
