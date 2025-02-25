package com.ikefercol.LigasJugadoresSpring.controller;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Equipo;
import com.ikefercol.LigasJugadoresSpring.model.Entidades.Estadio;
import com.ikefercol.LigasJugadoresSpring.model.Entidades.Liga;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EquipoRepository;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EstadioRepository;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/jug")
public class VueController {

    @Autowired
    EquipoRepository equipoRepository;
    @Autowired
    EstadioRepository estadioRepository;
    @Autowired
    LigaRepository ligaRepository;

    @GetMapping("/equipos")
    public List<Equipo> getEquipos() {
        return equipoRepository.findAll();
    }

    @GetMapping("/estadios")
    public List<Estadio> getEstadios() {
        return estadioRepository.findAll();
    }

    @GetMapping("/ligas")
    public List<Liga> getLigas() {
        return ligaRepository.findAll();
    }


}
