package com.ikefercol.LigasJugadoresSpring.controller;

import com.ikefercol.LigasJugadoresSpring.Service.EquipoObtenerPorLigaService;
import com.ikefercol.LigasJugadoresSpring.Service.EstadioCapacidadMaximaService;
import com.ikefercol.LigasJugadoresSpring.Service.LigaObtenerTodas;
import com.ikefercol.LigasJugadoresSpring.model.Entidades.Liga;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EquipoRepository;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EstadioRepository;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {


    @Autowired
    EquipoRepository equipoRepository;

    @Autowired
    LigaRepository ligaRepository;

    @Autowired
    EstadioRepository estadioRepository;



    @GetMapping("/equipo")
    public String getEquipos(Model model){
        model.addAttribute("equipos", equipoRepository.findAll());
        return "equipos";
    }
    @GetMapping("/estadio")
    public String getEstadios(Model model){
        model.addAttribute("estadios", estadioRepository.findAll());
        return "estadios";
    }
    @GetMapping("/liga")
    public String getLigas(Model model){
        model.addAttribute("ligas", ligaRepository.findAll());
        return "ligas";
    }


}
