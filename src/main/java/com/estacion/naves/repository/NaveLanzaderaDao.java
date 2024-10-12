package com.estacion.naves.repository;

import com.estacion.naves.model.NaveEspacial;
import com.estacion.naves.model.NaveLanzadera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NaveLanzaderaDao extends JpaRepository<NaveLanzadera, Integer> {
}
