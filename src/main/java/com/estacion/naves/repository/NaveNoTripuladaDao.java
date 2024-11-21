package com.estacion.naves.repository;

import com.estacion.naves.model.NaveNoTripulada;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz que permite hacer consultas a la base de datos,
 * con la tabla naveNoTripulada.
 */
public interface NaveNoTripuladaDao extends JpaRepository<NaveNoTripulada, Integer> {
}
