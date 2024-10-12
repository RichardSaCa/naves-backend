package com.estacion.naves.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data //métodos get constructor
@Table(name = "Navelanzadera")
/**
 * Esta clase es hija de Nave espacial
 *
 * También tiene atributos unicos al tipo de nave.
 */
public class NaveLanzadera extends NaveEspacial {

    private String objetoLanza;

    private String tipoCombustible;

    private int pesoTransporte;
}
