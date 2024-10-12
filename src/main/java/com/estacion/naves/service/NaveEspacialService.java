package com.estacion.naves.service;

import com.estacion.naves.model.NaveEspacial;

import java.util.List;

/**
 * Esta interfaz muestra abstracciones para Nave espacial
 */
public interface NaveEspacialService {

    public List<NaveEspacial> obtenerTodasNaves();
}
