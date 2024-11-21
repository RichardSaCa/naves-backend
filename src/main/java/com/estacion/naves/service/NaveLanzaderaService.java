package com.estacion.naves.service;

import com.estacion.naves.model.NaveLanzadera;

import java.util.List;

/**
 *  Esta interfaz que muestra abstracciones para Nave lanzadera
 */
public interface NaveLanzaderaService {
    public List<NaveLanzadera> listarLanzaderas();

    public NaveLanzadera crearNaveLanzadera(NaveLanzadera nave);
}
