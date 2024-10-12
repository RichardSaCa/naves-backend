package com.estacion.naves.repository;

import com.estacion.naves.model.NaveEspacial;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Esta es una interfaz que permite el framework de spring, por medio de
 * Spring JPA realizar consultas tipo CRUD
 */
public interface NaveEspacialDao extends JpaRepository<NaveEspacial, Integer> {
}
