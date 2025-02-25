package com.ikefercol.LigasJugadoresSpring.model.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Estadio")
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nombre;
    int capacidad;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    Equipo equipo_id;


    public Estadio(){}

    public Estadio(long id, String nombre, int capacidad, Equipo equipo_id) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipo_id = equipo_id;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Equipo getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(Equipo equipo_id) {
        this.equipo_id = equipo_id;
    }
}
