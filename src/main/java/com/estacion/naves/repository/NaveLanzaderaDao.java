package com.estacion.naves.repository;

import com.estacion.naves.model.NaveEspacial;
import com.estacion.naves.model.NaveLanzadera;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz que permite la conexión con la base de datos relacionada con
 * la tabla naveLanzadera
 */
public interface NaveLanzaderaDao extends JpaRepository<NaveLanzadera, Integer> {
}
