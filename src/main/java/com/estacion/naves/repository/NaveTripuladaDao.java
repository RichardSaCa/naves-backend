package com.estacion.naves.repository;

import com.estacion.naves.model.NaveNoTripulada;
import com.estacion.naves.model.NaveTripulada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NaveTripuladaDao extends JpaRepository<NaveTripulada, Integer> {
}
