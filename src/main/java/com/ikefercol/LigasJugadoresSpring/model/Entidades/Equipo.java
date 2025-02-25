package com.ikefercol.LigasJugadoresSpring.model.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "Equipo")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String equipo;
    private String lugar;
    private String mejorjugador;
    private String imagen;
    @ManyToOne
    @JoinColumn(name = "LIGA_ID")
    private Liga liga_id;

    public Equipo(){

    }

    public Equipo(Long id, String equipo, String lugar, String mejorjugador, String imagen, Liga liga_id) {
        this.id = id;
        this.equipo = equipo;
        this.lugar = lugar;
        this.mejorjugador = mejorjugador;
        this.imagen = imagen;
        this.liga_id = liga_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMejorjugador() {
        return mejorjugador;
    }

    public void setMejorjugador(String mejorjugador) {
        this.mejorjugador = mejorjugador;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Liga getLiga_id() {
        return liga_id;
    }

    public void setLiga_id(Liga liga_id) {
        this.liga_id = liga_id;
    }
}
