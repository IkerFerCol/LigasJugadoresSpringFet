package com.ikefercol.LigasJugadoresSpring.Service;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Equipo;
import com.ikefercol.LigasJugadoresSpring.model.Entidades.Estadio;
import com.ikefercol.LigasJugadoresSpring.model.Entidades.Liga;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EquipoRepository;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EstadioRepository;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.LigaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListarBDAService {

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private EstadioRepository estadioRepository;


    public void ListarLigas() {
        System.out.println("## LIGAS ##");
        for (Liga liga : ligaRepository.findAll()){
            System.out.println(liga.getNombre());
        }
    }
    public void ListarEquipos() {
        System.out.println("## EQUIPOS ##");
        for (Equipo equipo : equipoRepository.findAll()){
            System.out.println(equipo.getEquipo());
        }
    }
    public void ListarEstadios() {
        System.out.println("## ESTADIOS ##");
        for (Estadio estadio : estadioRepository.findAll()){
            System.out.println(estadio.getNombre());
        }
    }

    @PostConstruct
    public void inicializar() {
        System.out.println("------------ Inicializando el servicio... --------------");
        ListarLigas();
        ListarEquipos();
        ListarEstadios();
    }
}
