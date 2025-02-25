//package com.ikefercol.LigasJugadoresSpring.controller;
//
//import com.ikefercol.LigasJugadoresSpring.model.Entidades.Equipo;
//import com.ikefercol.LigasJugadoresSpring.model.Repositorios.EquipoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/equipos")
//public class EquipoController {
//
//    @Autowired
//    EquipoRepository equipoRepository;
//
//    @GetMapping
//    public List<Equipo> obtenerequipos() {
//        return (List<Equipo>) equipoRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Equipo> obtenerEquipoporId(@PathVariable(value = "id") Long id) {
//        Optional<Equipo> equipo = equipoRepository.findById(id);
//
//        if (equipo.isPresent()) {
//            return ResponseEntity.ok().body(equipo.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//    @DeleteMapping("/{id}")
//    public void eliminarEquipo(@PathVariable Long id) {
//        equipoRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Equipo> actualizarEquipo(@PathVariable Long id, @RequestBody Equipo equipoActualizado) {
//        Optional<Equipo> optionalEquipo = equipoRepository.findById(id);
//
//        if (optionalEquipo.isPresent()) {
//            Equipo equipo = optionalEquipo.get();
//            equipo.setEquipo(equipoActualizado.getEquipo());
//            equipo.setLugar(equipoActualizado.getLugar());
//            equipo.setMejorJugador(equipoActualizado.getMejorJugador());
//            equipo.setImagen(equipoActualizado.getImagen());
//            equipo.setLiga_id(equipoActualizado.getLiga_id());
//            return ResponseEntity.ok().body(equipoRepository.save(equipo));
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//}
