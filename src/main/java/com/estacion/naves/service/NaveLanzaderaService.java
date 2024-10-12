package com.estacion.naves.service;

import com.estacion.naves.model.NaveLanzadera;

import java.util.List;

public interface NaveLanzaderaService {
    public List<NaveLanzadera> listarLanzaderas();

    public NaveLanzadera crearNaveLanzadera(NaveLanzadera nave);
}
