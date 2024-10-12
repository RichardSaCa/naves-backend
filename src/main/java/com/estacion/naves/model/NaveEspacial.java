package com.estacion.naves.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
/**
 * Representa la herencia. Spring framework
 */
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Naveespacial")
/**
 * Esta es la clase padre de todas las naves, porque tiene atributos
 * comunes en las clases hijas. Las clases hijas son:
 *
 * NaveLanzadera - NaveNoTripulada - NaveTripulada
 *
 * En esta clase aplicamos encapsulación.
 */
public  class NaveEspacial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNaveEspacial")
    private int idNaveEspacial ;

    private String nombre;

    private int potencia;

    private String pais;

    private int peso;

    public NaveEspacial() {
    }

    public int getIdNaveEspacial() {
        return idNaveEspacial;
    }

    public void setIdNaveEspacial(int idNaveEspacial) {
        this.idNaveEspacial = idNaveEspacial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

