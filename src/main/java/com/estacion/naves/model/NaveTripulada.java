package com.estacion.naves.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data //métodos get constructor
@Table(name = "Navetripulada")
/**
 * Esta clase es hija de Nave espacial
 *
 * También tiene atributos unicos al tipo de nave.
 */
public class NaveTripulada extends NaveEspacial {

    private String mision;

    private int numeroTripulantes;

}
