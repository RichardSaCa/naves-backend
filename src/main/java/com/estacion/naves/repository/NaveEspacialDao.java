package com.estacion.naves.repository;

import com.estacion.naves.model.NaveEspacial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Esta es una interfaz que permite por medio de
 * Spring JPA realizar consultas tipo CRUD
 */
public interface NaveEspacialDao extends JpaRepository<NaveEspacial, Integer> {

    /**
     * Consulta para obtener naves espaciales de acuerdo al valor de búsqueda digitado. Retorna
     * una lista con las naves encontradas.
     */
    @Query("SELECT e FROM NaveEspacial e  LEFT JOIN NaveNoTripulada n ON e.idNaveEspacial = n.idNaveEspacial WHERE (e.nombre LIKE %:valor% or e.pais LIKE" +
            "%:valor% or n.mision LIKE %:valor%)")
    List<NaveEspacial> buscarPorCualquierColumna(String valor);

//    @Query("SELECT e FROM Dependencia e WHERE (e.id_dependencias =:id)")
//    Dependencia encontrarDependencia(String id);
//
//    @Query("SELECT e FROM Empleado e WHERE (e.cedula LIKE %:ced%)")
//    List<Empleado> empleadoSimilitudCedula(String ced);
}
