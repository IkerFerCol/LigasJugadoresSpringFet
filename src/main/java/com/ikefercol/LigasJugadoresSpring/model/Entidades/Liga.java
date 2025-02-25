package com.ikefercol.LigasJugadoresSpring.model.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Liga")
public class Liga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nombre;

    public Liga(){

    }

    public Liga(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
