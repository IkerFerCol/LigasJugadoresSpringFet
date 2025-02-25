package com.ikefercol.LigasJugadoresSpring.Service;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Equipo;
import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipoObtenerPorLigaService {

    @Autowired
    private EquipoRepository equipoRepository;


    public List<Equipo> obtenerEquiposPorId(String nombrePais) {
        List<Equipo> equipos = equipoRepository.findAll();
        List<Equipo> resultado = new ArrayList<>();

        for (Equipo equipo : equipos) {
            if (equipo.getLiga_id().getNombre().equalsIgnoreCase(nombrePais)) {
                resultado.add(equipo);
            }
        }

        return resultado;
    }




    public Iterable<Equipo> getAllEquipos() {
        return equipoRepository.findAll();
    }
}
