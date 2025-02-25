package com.ikefercol.LigasJugadoresSpring.model.Repositorios;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}
