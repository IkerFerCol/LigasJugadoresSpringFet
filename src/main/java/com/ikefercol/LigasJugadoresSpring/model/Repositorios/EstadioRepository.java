package com.ikefercol.LigasJugadoresSpring.model.Repositorios;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EstadioRepository extends JpaRepository<Estadio, Long> {
}
