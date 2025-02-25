package com.ikefercol.LigasJugadoresSpring.model.Repositorios;

import com.ikefercol.LigasJugadoresSpring.model.Entidades.Liga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LigaRepository extends JpaRepository<Liga, Long> {
}
